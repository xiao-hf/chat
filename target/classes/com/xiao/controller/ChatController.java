package com.xiao.controller;

import com.github.pagehelper.PageInfo;
import com.xiao.common.R;
import com.xiao.dao.dto.CpcGroupChatMessage;
import com.xiao.dao.inter.CpcGroupChatMessageMapper;
import com.xiao.utils.ExcelUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("chat")
public class ChatController {
    @Resource
    CpcGroupChatMessageMapper messageMapper;
    @GetMapping("export")
    public R<String> export(HttpServletResponse resp) throws IOException {
        List<CpcGroupChatMessage> messages = messageMapper.selectAll();
        ServletOutputStream os = resp.getOutputStream();
        String fileName = "messages.xlsx";
        resp.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        ExcelUtil.writeListToOS(os, messages, CpcGroupChatMessage.class);
        os.flush();
        os.close();
        return R.success("导出成功!");
    }

    @GetMapping("getAll")
    public R<PageInfo<CpcGroupChatMessage>> getAll() {
        return R.success(new PageInfo<>(messageMapper.selectAll()));
    }
}