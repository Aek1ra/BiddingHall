package com.akiteam.demo.service.impl;

import com.akiteam.demo.entity.GoodsInfo;
import com.akiteam.demo.pojo.*;
import com.akiteam.demo.entity.AuctionInfo;
import com.akiteam.demo.mapper.AuctionMapper;
import com.akiteam.demo.service.AuctionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.akiteam.demo.util.MoneyUtils.amountConversion;

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
    public void changeInfoStatus(UserId userId) {
        auctionMapper.changeInfoStatus(userId.getUserId());
    }

    @Override
    public List<GetInformation> getInformation(Info info) {
        return auctionMapper.getInformation(info.getUserId(),info.getStatus());
    }

    @Override
    public PageResult getGoodsInfo(GoodsName goodsName) {
        PageHelper.startPage(goodsName.getPageNum(),goodsName.getPageSize());
        List<GoodsInfo> goodsInfo = auctionMapper.getGoodsInfo(goodsName.getGoodsName());
        PageInfo<GoodsInfo> page = new PageInfo<>(goodsInfo);
        return new PageResult(page.getTotal(),page.getPageSize(),page.getPages(),page.getList());
    }

    @Override
    public List<PassengerFlowAndSalesVolume> getPassengerFlowAndSalesVolume() {
        List<PassengerFlowAndSalesVolume> passengerFlowAndSalesVolumeList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,10,20,40,80,160);
        list.forEach(
                (num) -> {passengerFlowAndSalesVolumeList.add(
                        auctionMapper.getPassengerFlowAndSalesVolume(num));
                });
        /**
         * 判断结果list里是否有null数据，有的话则使用（0,0）填充
         */
        for (int i = 0; i < passengerFlowAndSalesVolumeList.size(); i++) {
            if (passengerFlowAndSalesVolumeList.get(i) == null){
                PassengerFlowAndSalesVolume pfasv = new PassengerFlowAndSalesVolume(0,0);
                passengerFlowAndSalesVolumeList.set(i,pfasv);
            }
        }
        return passengerFlowAndSalesVolumeList;
    }

    @Override
    public TheQuoteAmount getTheQuoteAmount(UserId userId) {
        Integer rank = auctionMapper.getQuoteAmountRank(userId);
        Integer maxQuoteAmount = auctionMapper.getMaxQuoteAmount();
        String upperCase = amountConversion(String.valueOf(maxQuoteAmount));
        return new TheQuoteAmount(maxQuoteAmount,upperCase,rank);
    }

    @Override
    public List<AuctionRank> getAuctionRank() {
        AuctionRank auc1 = new AuctionRank("石头", 71.3);
        AuctionRank auc2 = new AuctionRank("沙子",24.1);
        AuctionRank auc3 = new AuctionRank("桌子",13.7);
        AuctionRank auc4 = new AuctionRank("椅子",5.9);
        List<AuctionRank> list = new ArrayList<>();
        list.add(auc1);
        list.add(auc2);
        list.add(auc3);
        list.add(auc4);
        return list;
    }
}
