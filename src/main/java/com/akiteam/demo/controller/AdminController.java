package com.akiteam.demo.controller;

import com.akiteam.demo.common.R;
import com.akiteam.demo.entity.UserInfo;
import com.akiteam.demo.service.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Tag(name = "管理相关接口")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 获取所有用户信息
     * @return
     */
    @PostMapping("/getAllUserInfo")
    @Operation(summary = "获取所有用户信息")
    public R<List<UserInfo>> getAllUserInfo(){
        return R.data(adminService.getAllUserInfo());
    }

}
