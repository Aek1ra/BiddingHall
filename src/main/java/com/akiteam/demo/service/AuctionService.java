package com.akiteam.demo.service;

import com.akiteam.demo.entity.GoodsInfo;
import com.akiteam.demo.pojo.*;
import com.akiteam.demo.entity.AuctionInfo;

import java.util.List;

public interface AuctionService{

    AuctionInfo addAuctionInfo(AuctionInfo auctionInfo);

    PageResult getAuctionRecords(PageHelperPojo pageHelperPojo);

    void changeInfoStatus(UserId userId);

    List<GetInformation> getInformation(Info info);

    PageResult getGoodsInfo(GoodsName goodsName);


    List<PassengerFlowAndSalesVolume> getPassengerFlowAndSalesVolume();

    TheQuoteAmount getTheQuoteAmount(UserId userId);

    List<AuctionRank> getAuctionRank();
}
