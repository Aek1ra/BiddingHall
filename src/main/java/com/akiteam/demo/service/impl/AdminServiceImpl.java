package com.akiteam.demo.service.impl;

import com.akiteam.demo.entity.UserInfo;
import com.akiteam.demo.mapper.AdminMapper;
import com.akiteam.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public UserInfo getAllUserInfo() {
        return adminMapper.getAllUserInfo();
    }
}
