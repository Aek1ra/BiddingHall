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
@TableName(value = "quotation_amount_table")
public class QuotationAmountTable {

    /**
     * 用户id
     */
    @Schema(name = "用户id")
    private Integer userId;

    /**
     * 商品id
     */
    @Schema(name = "用户id")
    private Integer id;

    /**
     * 开始时间
     */
    @Schema(name = "开始时间")
    private Integer startTime;

    /**
     * 结束时间
     */
    @Schema(name = "结束时间")
    private Integer endTime;

    /**
     * 用户出价
     */
    @Schema(name = "用户出价")
    private BigDecimal money;

}
