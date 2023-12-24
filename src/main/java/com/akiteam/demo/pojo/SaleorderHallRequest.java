package com.akiteam.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.PrimitiveIterator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "竞价大厅分页请求类")
public class SaleorderHallRequest {

    /**
     * 页码
     */
    @ApiModelProperty(value = "页码")
    private Integer limit;

    /**
     * 页数
     */
    @ApiModelProperty(value = "页数")
    private Integer pages;
}
