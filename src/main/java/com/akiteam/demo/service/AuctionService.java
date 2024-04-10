package com.akiteam.demo.service;

import com.akiteam.demo.pojo.PageResult;
import com.akiteam.demo.entity.AuctionInfo;
import com.akiteam.demo.pojo.PageHelperPojo;

public interface AuctionService{

    AuctionInfo addAuctionInfo(AuctionInfo auctionInfo);

    PageResult getAuctionRecords(PageHelperPojo pageHelperPojo);
}
