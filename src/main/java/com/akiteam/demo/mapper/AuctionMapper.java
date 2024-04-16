package com.akiteam.demo.mapper;

import com.akiteam.demo.entity.GoodsInfo;
import com.akiteam.demo.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuctionMapper {
    void insertAuctionInfo();

    List<AuctionRecords> getAllAuctionInfo();

    void changeInfoStatus(Integer infoId);

    List<GetInformation> getInformation(Integer userId, Integer status);

    List<GoodsInfo> getGoodsInfo(String goodsName);

    PassengerFlowAndSalesVolume getPassengerFlowAndSalesVolume(Integer timeNode);

    Integer getMaxQuoteAmount();

    Integer getQuoteAmountRank(UserId userId);
}
