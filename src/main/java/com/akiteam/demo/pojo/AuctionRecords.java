package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Schema(name = "竞价商品记录")
public class AuctionRecords {

    /**
     * 竞价商品名称
     */
    @Schema(name = "goodsName",description = "竞价商品名称")
    private String goodsName;

    /**
     * 报价数量
     */
    @Schema(name = "auctionNum",description = "报价数量")
    private Integer auctionNum;

    /**
     * 报价金额
     */
    @Schema(name = "auctionPrice",description = "报价金额")
    private BigDecimal auctionPrice;

    /**
     * 报价时间
     */
    @Schema(name = "auctionTime",description = "报价时间")
    private Timestamp auctionTime;

}
