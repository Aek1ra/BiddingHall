package com.akiteam.demo.mapper;

import com.akiteam.demo.entity.AuctionInfo;
import com.akiteam.demo.pojo.AuctionRecords;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuctionMapper {
    void insertAuctionInfo();

    List<AuctionRecords> getAllAuctionInfo();
}
