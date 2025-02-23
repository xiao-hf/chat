package com.xiao.socket.claude;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Slf4j
public class ChatServer {
    private final Configuration config;
    private final SocketIOServer server;
    // 使用ConcurrentHashMap存储每个群组的消息历史
    private final Map<String, List<ChatMessage>> messageHistory = new ConcurrentHashMap<>();
    
    public ChatServer() {
        config = new Configuration();
        config.setHostname("localhost");
        config.setPort(9092);
        
        server = new SocketIOServer(config);
        
        // 处理客户端连接事件
        server.addConnectListener(client -> {
            String userId = client.getHandshakeData().getSingleUrlParam("userId");
            log.info("Client connected: {}", userId);
            // 将userId存储在socket session中
            client.set("userId", userId);
        });
        
        // 处理消息事件
        server.addEventListener("chat", ChatMessage.class, (client, data, ackRequest) -> {
            String userId = client.get("userId");
            data.setUserId(userId);
            data.setTimestamp(System.currentTimeMillis());
            
            // 存储消息历史
            messageHistory.computeIfAbsent(data.getGroupId(), k -> Collections.synchronizedList(new ArrayList<>()))
                         .add(data);
            
            // 广播消息给群组内所有成员
            server.getRoomOperations(data.getGroupId()).sendEvent("chat", data);
        });
        
        // 处理获取消息历史请求
        server.addEventListener("getHistory", String.class, (client, groupId, ackRequest) -> {
            List<ChatMessage> history = messageHistory.getOrDefault(groupId, Collections.emptyList());
            // 按时间戳倒序排序
            List<ChatMessage> sortedHistory = history.stream()
                .sorted((m1, m2) -> Long.compare(m2.getTimestamp(), m1.getTimestamp()))
                .collect(Collectors.toList());
            client.sendEvent("history", sortedHistory);
        });
        
        // 处理加入群组请求
        server.addEventListener("joinGroup", String.class, (client, groupId, ackRequest) -> {
            client.joinRoom(groupId);
            log.info("Client {} joined group {}", client.get("userId"), groupId);
        });
        
        // 处理离开群组请求
        server.addEventListener("leaveGroup", String.class, (client, groupId, ackRequest) -> {
            client.leaveRoom(groupId);
            log.info("Client {} left group {}", client.get("userId"), groupId);
        });
    }
    
    public void start() {
        server.start();
        log.info("Chat server started on port {}", config.getPort());
    }
    
    public void stop() {
        server.stop();
        log.info("Chat server stopped");
    }
    
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.start();
    }
}