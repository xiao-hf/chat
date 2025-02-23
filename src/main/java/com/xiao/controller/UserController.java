//package com.xiao.controller;
//
//import com.xiao.common.R;
//import com.xiao.dao.dto.CpcUser;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//import service.CpcUserService;
//
//import javax.annotation.Resource;
//
//@Slf4j
//@RestController
//@RequestMapping("user")
//public class UserController {
//
//    @Resource
//    CpcUserService userService;
//
//    @GetMapping("test")
//    public R<String> test() {
//        return R.success(null);
//    }
//
//    @PostMapping("login")
//    public R<CpcUser> login(@RequestBody CpcUser user) {
//        return userService.login(user);
//    }
//}
