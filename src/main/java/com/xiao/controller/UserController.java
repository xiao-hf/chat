package com.xiao.controller;

import com.xiao.common.R;
import com.xiao.dao.dto.CpcUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.xiao.service.CpcUserService;

import javax.annotation.Resource;

@Slf4j
@RestController
@Api("用户接口")
@RequestMapping("user")
public class UserController {

    @Resource
    CpcUserService cpcUserService;
    @ApiOperation("用户测试")
    @GetMapping("test")
    public R<String> test() {
        return R.success(null);
    }

    @PostMapping("login")
    public R<CpcUser> login(@RequestBody CpcUser user) {
        return cpcUserService.login(user);
    }
}
