package com.akiteam.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
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
@TableName(value = "quotation_amount_table")
public class QuotationAmountTable {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer userId;

    /**
     * 商品id
     */
    @ApiModelProperty(value = "用户id")
    private Integer id;

    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间")
    private Integer startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间")
    private Integer endTime;

    /**
     * 用户出价
     */
    @ApiModelProperty(value = "用户出价")
    private BigDecimal money;

}
