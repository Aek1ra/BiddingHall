package com.akiteam.demo.service.impl;

import com.akiteam.demo.entity.GoodsInfo;
import com.akiteam.demo.pojo.*;
import com.akiteam.demo.entity.AuctionInfo;
import com.akiteam.demo.mapper.AuctionMapper;
import com.akiteam.demo.service.AuctionService;
import com.github.pagehelper.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

    @Autowired
    private AuctionMapper auctionMapper;

    @Override
    public AuctionInfo addAuctionInfo(AuctionInfo auctionInfo) {
        AuctionInfo auctionInformetion = AuctionInfo.builder()
                .goodsName(auctionInfo.getGoodsName())
                .auctionNum(auctionInfo.getAuctionNum())
                .auctionTime(Timestamp.valueOf(LocalDateTime.now()))
                .auctionPrice(auctionInfo.getAuctionPrice())
                .remark(auctionInfo.getRemark())
                .auctionUserId(auctionInfo.getAuctionUserId())
                .build();
        auctionMapper.insertAuctionInfo();
        return auctionInformetion;
    }

    @Override
    public PageResult getAuctionRecords(PageHelperPojo pageHelperPojo) {
        PageHelper.startPage(pageHelperPojo.getPageNum(),pageHelperPojo.getPageSize());
        List<AuctionRecords> list = auctionMapper.getAllAuctionInfo();
        PageInfo<AuctionRecords> page = new PageInfo<>(list);
        return new PageResult(page.getTotal(),page.getPageSize(),page.getPages(),page.getList());
    }

    @Override
    public void changeInfoStatus(InfoId infoId) {
        auctionMapper.changeInfoStatus(infoId.getInfoId());
    }

    @Override
    public List<GetInformation> getInformation(Info info) {
        return auctionMapper.getInformation(info.getUserId(),info.getStatus());
    }

    @Override
    public List<GoodsInfo> getGoodsInfo(GoodsName goodsName) {
        return auctionMapper.getGoodsInfo(goodsName.getGoodsName());
    }

    @Override
    public List<PassengerFlowAndSalesVolume> getPassengerFlowAndSalesVolume() {
        List<PassengerFlowAndSalesVolume> passengerFlowAndSalesVolumeList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,10,20,40,80,160);
        list.forEach(
                (num) -> {passengerFlowAndSalesVolumeList.add(auctionMapper.getPassengerFlowAndSalesVolume(num));}
        );
        return passengerFlowAndSalesVolumeList;
    }


}
