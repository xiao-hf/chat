package com.xiao.socket.claude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String userId;
    private String groupId;
    private String content;
    private long timestamp;
    private String contentType;
    private Boolean isDeleted;
    private Boolean isKeyMessage;
    private Boolean isPinned;
    private LocalDateTime createTime;
    private Long updateUserId;
}