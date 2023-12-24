package com.akiteam.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@ApiModel(value = "竞价大厅实体类")
@TableName(value = "bidding_hall")
public class BiddingHall implements Serializable {

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键id")
    private int id;

    /**
     * 竞价商品名称
     */
    @ApiModelProperty(value = "竞价商品名称")
    private String tradeName;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量")
    private Integer tradeNum;

    /**
     * 起拍价格
     */
    @ApiModelProperty(value = "起拍价格")
    private BigDecimal startingPrice;

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
