package com.akiteam.demo.mapper;

import com.akiteam.demo.entity.BiddingHall;
import com.akiteam.demo.entity.QuotationTrend;
import com.akiteam.demo.pojo.SaleorderBidingRequest;
import com.akiteam.demo.pojo.SaleorderHallRequest;
import com.akiteam.demo.pojo.SaleorderHallResult;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BiddingHallMapper {

    /**
     * 添加竞价信息
     * @param saleorderBidingRequest
     * @return
     */
    SaleorderBidingRequest addBiddingInfo(SaleorderBidingRequest saleorderBidingRequest);

    /**、
     * 分页查询
     * @param saleorderHallRequest
     * @return
     */
    Page<SaleorderHallResult> pageQuery(SaleorderHallRequest saleorderHallRequest,String tradeName);

    /**
     * 根据商品id查询用户竞拍信息
     * @param id
     * @return
     */
    BiddingHall getInfoById(Integer id);

}
