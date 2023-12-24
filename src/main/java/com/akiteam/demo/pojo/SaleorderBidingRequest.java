package com.akiteam.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "竞价请求类")
public class SaleorderBidingRequest {
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
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 联系方式
     */
    @ApiModelProperty(value = "联系方式")
    private Integer phone;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String address;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称")
    private String tradeName;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量")
    private Integer tradeNum;

    /**
     * 时间，精确到分钟
     */
    @ApiModelProperty(value = "时间，精确到分钟")
    private String time;

    /**
     * 报价金额
     */
    @ApiModelProperty(value = "报价金额")
    private Integer money;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String notes;
}
