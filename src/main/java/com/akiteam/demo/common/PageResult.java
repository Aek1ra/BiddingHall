package com.akiteam.demo.common;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "分页")
public class PageResult implements Serializable {

    /**
     * 总数据数
     */
    @ApiModelProperty(value = "总记录数")
    private long total; //总记录数

    /**
     * 当前页数据集合
     */
    @ApiModelProperty(value = "当前页数据集合")
    private List records; //当前页数据集合

}
