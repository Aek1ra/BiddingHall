package com.akiteam.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "竞价大厅分页响应类")
public class SaleorderHallResult {

    /**
     * 竞价商品名称
     */
    @ApiModelProperty(value = "竞价商品名称")
    private String tradeName;

    /**
     * 商品数量
     */
    @ApiModelProperty(value = "商品数量")
    private Integer tradeNum;

    /**
     * 起拍价格
     */
    @ApiModelProperty(value = "起拍价格")
    private Integer startingPrice;

    /**
     * 竞拍类型
     */
    @ApiModelProperty(value = "竞拍类型")
    private Integer auctionType;

    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间")
    private String startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间")
    private String endTime;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;

    /**
     * 操作
     */
    @ApiModelProperty(value = "操作")
    private Integer operate;

}
