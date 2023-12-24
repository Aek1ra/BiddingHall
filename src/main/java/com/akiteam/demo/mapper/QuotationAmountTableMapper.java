package com.akiteam.demo.mapper;

import com.akiteam.demo.pojo.SaleorderBidingRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@Mapper
public interface QuotationAmountTableMapper {

    /**
     * 根据用户id查询用户报价金额信息
     * @param id
     * @return
     */
    BigDecimal getMoney(int id);

    /**
     * 根据用户id查询用户最高报价金额信息
     * @param id
     * @return
     */
    BigDecimal getMaxMoney(int id);

    /**
     * 添加竞价信息
     * @param saleorderBidingRequest
     * @return
     */
    void addBiddingInfo(SaleorderBidingRequest saleorderBidingRequest);
}
