package com.akiteam.demo.mapper;

import com.akiteam.demo.entity.UserInfo;
import com.akiteam.demo.pojo.UserId;
import com.akiteam.demo.pojo.UserLoginInfo;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;

@Mapper
public interface UserMapper {
    void save(UserInfo userInfo);

    Integer login(UserLoginInfo userLoginInfo);
    
    void loginStatusChange(Integer userId);

    void logout(UserId userId);

    void insertLoginTime(Timestamp currentTimestamp, Integer userId);
}
