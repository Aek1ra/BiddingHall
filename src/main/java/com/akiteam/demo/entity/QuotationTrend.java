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
@ApiModel(value = "报价")
@TableName(value = "quotation_trend")
public class QuotationTrend implements Serializable {

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键id")
    private int id;

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
     * 距离结束时间
     */
    @ApiModelProperty(value = "距离结束时间")
    private String distanceEndTime;

    /**
     * 最高报价
     */
    @ApiModelProperty(value = "最高报价")
    private BigDecimal highestQuotation;

    /**
     * 我的数量
     */
    @ApiModelProperty(value = "我的数量")
    private Integer tradeNum;

    /**
     * 我的报价
     */
    @ApiModelProperty(value = "我的报价")
    private BigDecimal money;
}

