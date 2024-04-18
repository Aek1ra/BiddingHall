package com.akiteam.demo.mapper;

import com.akiteam.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<UserInfo> getAllUserInfo();
}
