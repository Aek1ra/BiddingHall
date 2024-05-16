package com.akiteam.demo.service.impl;

import com.akiteam.demo.mapper.IndexMapper;
import com.akiteam.demo.pojo.IndexGoodsTotal;
import com.akiteam.demo.pojo.IndexRemindTotal;
import com.akiteam.demo.pojo.UnreadInformation;
import com.akiteam.demo.pojo.UserId;
import com.akiteam.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public IndexGoodsTotal getGoodsTotal() {
        return new IndexGoodsTotal(indexMapper.getGoodsTotal());
    }

    @Override
    public IndexRemindTotal getRemindTotal(UserId userId) {
        return new IndexRemindTotal(indexMapper.getRemindTotal(userId.getUserId()));
    }

    @Override
    public List<UnreadInformation> getUnreadInformation(UserId userId) {
        return indexMapper.getUnreadInformation(userId.getUserId());
    }


}
