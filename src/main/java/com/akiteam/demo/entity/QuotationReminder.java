package com.akiteam.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@ApiModel(value = "竞价大厅实体类")
@TableName(value = "quotation_reminder")
public class QuotationReminder {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer userId;

    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id")
    private Integer id;

    /**
     * 报价金额
     */
    @ApiModelProperty(value = "报价金额")
    private BigDecimal money;

    /**
     * 申请竞拍的数量
     */
    @ApiModelProperty(value = "申请竞拍的数量")
    private Integer applyForBidding;

    /**
     * 要竞拍的数量
     */
    @ApiModelProperty(value = "要竞拍的数量")
    private Integer numberOfBids;

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

}
