package com.akiteam.demo.service;

import com.akiteam.demo.pojo.User;
import com.akiteam.demo.pojo.UserId;
import com.akiteam.demo.pojo.UserLoginAccess;
import com.akiteam.demo.pojo.UserLoginInfo;

public interface UserService {
    String register(User user);

    UserLoginAccess login(UserLoginInfo userLoginInfo);

    String logout(UserId userId);
}
