package com.akiteam.demo.mapper;

import com.akiteam.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    UserInfo getAllUserInfo();
}
