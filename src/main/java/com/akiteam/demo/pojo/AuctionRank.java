package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "竞价排名")
public class AuctionRank {

    /**
     * 竞价商品名称
     */
    @Schema(name = "goodsName",description = "商品名称")
    private String goodsName;

    /**
     * 竞价商品名称
     */
    @Schema(name = "goodsProportion",description = "商品占比")
    private Double goodsProportion;
}
