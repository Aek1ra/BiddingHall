package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "竞价请求类")
public class SaleorderBidingRequest {
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
     * 姓名
     */
    @Schema(name = "姓名")
    private String name;

    /**
     * 联系方式
     */
    @Schema(name = "联系方式")
    private Integer phone;

    /**
     * 地址
     */
    @Schema(name = "地址")
    private String address;

    /**
     * 商品名称
     */
    @Schema(name = "商品名称")
    private String tradeName;

    /**
     * 数量
     */
    @Schema(name = "数量")
    private Integer tradeNum;

    /**
     * 时间，精确到分钟
     */
    @Schema(name = "时间，精确到分钟")
    private String time;

    /**
     * 报价金额
     */
    @Schema(name = "报价金额")
    private Integer money;

    /**
     * 备注
     */
    @Schema(name = "备注")
    private String notes;
}
