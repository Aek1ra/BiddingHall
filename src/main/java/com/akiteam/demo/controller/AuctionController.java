package com.akiteam.demo.controller;

import com.akiteam.demo.common.AkiConstant;
import com.akiteam.demo.entity.GoodsInfo;
import com.akiteam.demo.pojo.*;
import com.akiteam.demo.common.R;
import com.akiteam.demo.entity.AuctionInfo;
import com.akiteam.demo.service.AuctionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auction")
@Tag(name = "竞价相关接口")
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    /**
     * 添加竞价信息
     * @return
     */
    @PostMapping("/addAuctionInfo")
    @Operation(summary = "添加竞价信息")
    public R<AuctionInfo> addAuctionInfo(@RequestBody AuctionInfo auctionInfo){
        return R.data(auctionService.addAuctionInfo(auctionInfo));
    }

    /**
     * 竞价信息通知分页
     * @return
     */
    @PostMapping("/getAuctionRecords")
    @Operation(summary = "竞价信息通知分页")
    public R<PageResult> getAuctionRecords(@RequestBody PageHelperPojo pageHelperPojo){
        return R.data(auctionService.getAuctionRecords(pageHelperPojo));
    }

    /**
     * 获取通知信息
     * @param info
     * @return
     */
    @PostMapping("/getTheReadInformation")
    @Operation(summary = "获取通知信息")
    public R<List<GetInformation>> getInformation(@RequestBody Info info){
        return R.data(auctionService.getInformation(info));
    }


    /**
     * 更改信息状态
     * @param userId
     * @return
     */
    @PostMapping("/changeInfoStatus")
    @Operation(summary = "更改信息状态")
    public R changeInfoStatus(@RequestBody UserId userId){
        auctionService.changeInfoStatus(userId);
        return R.success(AkiConstant.DEFAULT_SUCCESS_MESSAGE.getMsg());
    }

    /**
     * 获取竞价信息
     * @param goodsName
     * @return
     */
    @PostMapping("/getGoodsInfo")
    @Operation(summary = "获取竞价信息")
    public R<PageResult> getGoodsInfo(@RequestBody GoodsName goodsName){
        return R.data(auctionService.getGoodsInfo(goodsName));
    }

    /**
     * 获取客流量和销售额
     * @return
     */
    @PostMapping("/getPassengerFlowAndSalesVolume")
    @Operation(summary = "获取客流量和销售额")
    public R<List<PassengerFlowAndSalesVolume>> getPassengerFlowAndSalesVolume(){
        return R.data(auctionService.getPassengerFlowAndSalesVolume());
    }

    /**
     * 获得最高报价金额，大写金额数目与当前登录用户id的报价排名
     * @param userId
     * @return
     */
    @PostMapping("/getTheQuoteAmount")
    @Operation(summary = "获得最高报价金额，大写金额数目与当前登录用户id的报价排名")
    public R<TheQuoteAmount> getTheQuoteAmount(@RequestBody UserId userId){
        return R.data(auctionService.getTheQuoteAmount(userId));
    }

    /**
     * 获取竞拍商品排名
     * @return
     */
    @PostMapping("/getAuctionRank")
    @Operation(summary = "获取竞拍商品排名")
    public R<List<AuctionRank>> getAuctionRank(){
        return R.data(auctionService.getAuctionRank());
    }

}
