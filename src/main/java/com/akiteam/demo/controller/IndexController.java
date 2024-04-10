package com.akiteam.demo.controller;

import com.akiteam.demo.common.R;
import com.akiteam.demo.pojo.IndexGoodsTotal;
import com.akiteam.demo.pojo.IndexRemindTotal;
import com.akiteam.demo.pojo.UserId;
import com.akiteam.demo.service.IndexService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
@Tag(name = "首页相关接口")
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 获取商品总量
     * @return
     */
    @PostMapping("/getGoodsTotal")
    @Operation(summary = "获取商品总量")
    public R<IndexGoodsTotal> getGoodsTotal(){
        return R.data(indexService.getGoodsTotal());
    }

    /**
     * 获取系统信息
     * @return
     */
    @PostMapping("/getRemindTotal")
    @Operation(summary = "获取系统信息")
    public R<IndexRemindTotal> getRemindTotal(@RequestBody UserId userId){
        return R.data(indexService.getRemindTotal(userId.getUserId()));
    }


}
