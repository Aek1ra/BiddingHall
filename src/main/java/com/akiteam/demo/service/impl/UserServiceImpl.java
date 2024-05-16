package com.akiteam.demo.service.impl;

import com.akiteam.demo.Constant.GlobalConstant;
import com.akiteam.demo.entity.UserInfo;
import com.akiteam.demo.mapper.UserMapper;
import com.akiteam.demo.pojo.User;
import com.akiteam.demo.pojo.UserId;
import com.akiteam.demo.pojo.UserLoginAccess;
import com.akiteam.demo.pojo.UserLoginInfo;
import com.akiteam.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String register(User user) {
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        UserInfo userInfo = UserInfo.builder()
                .name(user.getName())
                .loginTime(null)
                .loginLocation(user.getLoginLocation())
                .createTime(currentTimestamp)
                .account(user.getAccount())
                .password(user.getPassword())
                .loginStatus(0)
                .build();
        userMapper.save(userInfo);
        return GlobalConstant.USER_REGISTER_SUCCESS;
    }

    @Override
    public UserLoginAccess login(UserLoginInfo userLoginInfo) {
        //返回的用户id
        Integer userId = userMapper.login(userLoginInfo);
        if (userId == null){
            return new UserLoginAccess(null,GlobalConstant.USER_LOGINFAILED);
        }else {
            //登录状态更改
            userMapper.loginStatusChange(userId);
            //获取当前时间
            Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
            //插入当前时间为登录时间
            userMapper.insertLoginTime(currentTimestamp,userId);
            UserId userId1 = new UserId(userId);
            return new UserLoginAccess(userId1.getUserId(),GlobalConstant.USER_LOGIN_SUCCESS);
        }
    }

    @Override
    public String logout(UserId userId) {
        userMapper.logout(userId);
        return GlobalConstant.USER_LOGOUT;
    }
}
