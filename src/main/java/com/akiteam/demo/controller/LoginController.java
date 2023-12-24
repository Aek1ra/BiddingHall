//package com.akiteam.demo.controller;
//
//import com.akiteam.demo.common.ResponseResult;
//import com.akiteam.demo.service.LoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class LoginController {
//
//    @Autowired
//    private LoginService loginService;
//
//    @PostMapping("/user/login")
//    public ResponseResult login(@RequestBody User user){
//        return loginService.login(user);
//    }
//}
