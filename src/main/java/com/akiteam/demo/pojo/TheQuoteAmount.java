package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "报价金额")
public class TheQuoteAmount {

    /**
     * 报价金额
     */
    @Schema(name = "maxQuoteAmount",description = "最高报价金额")
    private Integer maxQuoteAmount;

    /**
     * 金额大写中文
     */
    @Schema(name = "amountInWords",description = "金额大写中文")
    private String amountInWords;

    /**
     * 报价金额排名
     */
    @Schema(name = "quoteAmountRank",description = "报价金额排名")
    private Integer quoteAmountRank;
}
