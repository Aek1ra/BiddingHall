package com.akiteam.demo.controller;

import com.akiteam.demo.common.PageResult;
import com.akiteam.demo.common.R;
import com.akiteam.demo.entity.QuotationReminder;
import com.akiteam.demo.entity.QuotationTrend;
import com.akiteam.demo.pojo.SaleorderBidingRequest;
import com.akiteam.demo.pojo.SaleorderHallRequest;
import com.akiteam.demo.service.BiddingHallService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saleorder")
@Tag(name = "竞价大厅相关接口")
@Slf4j
public class BiddingHallController {

    @Autowired
    private BiddingHallService biddingHallService;
    /**
     * 添加竞价信息
     * @param saleorderBidingRequest
     * @return
     */
    @PostMapping("/SaleorderBiding")
    @Operation(summary = "添加竞价信息")
    public R SaleorderBiding(SaleorderBidingRequest saleorderBidingRequest){
        return R.status(biddingHallService.addBiddingInfo(saleorderBidingRequest));
    }

    /**
     * 竞价大厅分页
     * @param saleorderHallRequest
     * @param tradeName
     * @return
     */
    @GetMapping("/SaleorderHall")
    @Operation(summary = "竞价大厅分页")
    public R<PageResult> SaleorderHall(SaleorderHallRequest saleorderHallRequest, String tradeName){
        return biddingHallService.pageQuery(saleorderHallRequest,tradeName);
    }

    /**
     * 根据id获取竞拍剩余时间和最高报价金额等等信息
     * @param id
     * @return
     */
    @GetMapping("/getDistanceEndTime")
    @Operation(summary = "根据id获取竞拍剩余时间和最高报价金额等等信息")
    public R<QuotationTrend> getDistanceEndTime(Integer id){
        return R.data(biddingHallService.getQuotationTrendInfo(id));
    }

    public R<QuotationReminder> quotationReminder(Integer userId){
        return null;
    }

}
