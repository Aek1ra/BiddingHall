package com.akiteam.demo.controller;

import com.akiteam.demo.Constant.MessageConstant;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/common")
@Tag(name = "通用接口")
@Slf4j
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return MessageConstant.LOGIN_SUCCESS;
    }

}
