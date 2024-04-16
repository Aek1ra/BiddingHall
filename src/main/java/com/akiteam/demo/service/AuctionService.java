package com.akiteam.demo.service;

import com.akiteam.demo.entity.GoodsInfo;
import com.akiteam.demo.pojo.*;
import com.akiteam.demo.entity.AuctionInfo;

import java.util.List;

public interface AuctionService{

    AuctionInfo addAuctionInfo(AuctionInfo auctionInfo);

    PageResult getAuctionRecords(PageHelperPojo pageHelperPojo);

    void changeInfoStatus(InfoId infoId);

    List<GetInformation> getInformation(Info info);

    List<GoodsInfo> getGoodsInfo(GoodsName goodsName);


    List<PassengerFlowAndSalesVolume> getPassengerFlowAndSalesVolume();

    TheQuoteAmount getTheQuoteAmount(UserId userId);
}
