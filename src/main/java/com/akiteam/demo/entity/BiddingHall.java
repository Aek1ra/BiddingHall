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
@Schema(name = "竞价大厅实体类")
@TableName(value = "bidding_hall")
public class BiddingHall implements Serializable {

    /**
     * 主键ID
     */
    @Schema(name = "主键id")
    private int id;

    /**
     * 竞价商品名称
     */
    @Schema(name = "竞价商品名称")
    private String tradeName;

    /**
     * 数量
     */
    @Schema(name = "数量")
    private Integer tradeNum;

    /**
     * 起拍价格
     */
    @Schema(name = "起拍价格")
    private BigDecimal startingPrice;

    /**
     * 竞拍类型
     */
    @Schema(name = "竞拍类型")
    private Integer auctionType;

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
     * 状态
     */
    @Schema(name = "状态")
    private Integer status;

    /**
     * 操作
     */
    @Schema(name = "操作")
    private Integer operate;
}
