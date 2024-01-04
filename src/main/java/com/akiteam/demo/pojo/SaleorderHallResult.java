package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "竞价大厅分页响应类")
public class SaleorderHallResult {

    /**
     * 竞价商品名称
     */
    @Schema(name = "竞价商品名称")
    private String tradeName;

    /**
     * 商品数量
     */
    @Schema(name = "商品数量")
    private Integer tradeNum;

    /**
     * 起拍价格
     */
    @Schema(name = "起拍价格")
    private Integer startingPrice;

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
