package com.akiteam.demo.controller;

import com.akiteam.demo.Constant.GlobalConstant;
import com.akiteam.demo.common.R;
import com.akiteam.demo.pojo.User;
import com.akiteam.demo.pojo.UserId;
import com.akiteam.demo.pojo.UserLoginInfo;
import com.akiteam.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "用户相关接口")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("/register")
    @Operation(summary = "注册")
    public R register(@RequestBody User user) {
        return R.success(userService.register(user));
    }

    /**
     * 登录
     * @param userLoginInfo
     * @return
     */
    @PostMapping("/login")
    @Operation(summary = "登录")
    public R<UserId> login(@RequestBody UserLoginInfo userLoginInfo) {
        return R.data(userService.login(userLoginInfo), GlobalConstant.USER_LOGIN_SUCCESS);
    }

    /**
     * 登出
     * @param userId
     * @return
     */
    @PostMapping("/logout")
    @Operation(summary = "登出")
    public R logout(@RequestBody UserId userId) {
        return R.success(userService.logout(userId));
    }

}
