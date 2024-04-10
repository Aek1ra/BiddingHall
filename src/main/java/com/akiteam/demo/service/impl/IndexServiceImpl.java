package com.akiteam.demo.service.impl;

import com.akiteam.demo.mapper.IndexMapper;
import com.akiteam.demo.pojo.IndexGoodsTotal;
import com.akiteam.demo.pojo.IndexRemindTotal;
import com.akiteam.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public IndexGoodsTotal getGoodsTotal() {
        return new IndexGoodsTotal(indexMapper.getGoodsTotal() + "吨");
    }

    @Override
    public IndexRemindTotal getRemindTotal(Integer userId) {
        return new IndexRemindTotal(indexMapper.getRemindTotal(userId));
    }
}
