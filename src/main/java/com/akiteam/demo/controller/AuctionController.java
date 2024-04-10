package com.akiteam.demo.controller;

import com.akiteam.demo.pojo.PageResult;
import com.akiteam.demo.common.R;
import com.akiteam.demo.entity.AuctionInfo;
import com.akiteam.demo.pojo.PageHelperPojo;
import com.akiteam.demo.service.AuctionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        PageResult pageResult = auctionService.getAuctionRecords(pageHelperPojo);
        return R.data(pageResult);
    }

}
