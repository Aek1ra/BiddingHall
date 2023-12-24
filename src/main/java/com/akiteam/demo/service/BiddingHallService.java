package com.akiteam.demo.service;

import com.akiteam.demo.common.PageResult;
import com.akiteam.demo.common.R;
import com.akiteam.demo.entity.QuotationTrend;
import com.akiteam.demo.pojo.SaleorderBidingRequest;
import com.akiteam.demo.pojo.SaleorderHallRequest;

public interface BiddingHallService {

    /**
     * 添加竞价信息
     * @param saleorderBidingRequest
     * @return
     */
    boolean addBiddingInfo(SaleorderBidingRequest saleorderBidingRequest);

    /**
     * 竞价大厅分页
     * @param saleorderHallRequest
     * @param tradeName
     * @return
     */
    R<PageResult> pageQuery(SaleorderHallRequest saleorderHallRequest, String tradeName);

    /**
     * 根据id获取竞拍剩余时间和最高报价金额等等信息
     * @param id
     * @return
     */
    QuotationTrend getQuotationTrendInfo(Integer id);
}
