package com.akiteam.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@Schema(name = "竞价大厅实体类")
@TableName(value = "quotation_reminder")
public class QuotationReminder {

    /**
     * 用户id
     */
    @Schema(name = "用户id")
    private Integer userId;

    /**
     * 商品id
     */
    @Schema(name = "商品id")
    private Integer id;

    /**
     * 报价金额
     */
    @Schema(name = "报价金额")
    private BigDecimal money;

    /**
     * 申请竞拍的数量
     */
    @Schema(name = "申请竞拍的数量")
    private Integer applyForBidding;

    /**
     * 要竞拍的数量
     */
    @Schema(name = "要竞拍的数量")
    private Integer numberOfBids;

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

}
