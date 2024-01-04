package com.akiteam.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "报价")
@TableName(value = "quotation_trend")
public class QuotationTrend implements Serializable {

    /**
     * 主键ID
     */
    @Schema(name = "主键id")
    private int id;

    /**
     * 开始时间
     */
    @Schema(name = "开始时间")
    private String startTime;

    /**
     * 结束时间
     */
    @Schema(name = "结束时间")
    private String endTime;

    /**
     * 距离结束时间
     */
    @Schema(name = "距离结束时间")
    private String distanceEndTime;

    /**
     * 最高报价
     */
    @Schema(name = "最高报价")
    private BigDecimal highestQuotation;

    /**
     * 我的数量
     */
    @Schema(name = "我的数量")
    private Integer tradeNum;

    /**
     * 我的报价
     */
    @Schema(name = "我的报价")
    private BigDecimal money;
}

