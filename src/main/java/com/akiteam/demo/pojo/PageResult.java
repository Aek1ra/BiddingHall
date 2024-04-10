package com.akiteam.demo.pojo;

import com.akiteam.demo.pojo.AuctionRecords;
import com.github.pagehelper.Page;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "分页")
public class PageResult implements Serializable {

    /**
     * 总记录数
     */
    @Schema(name = "total",description = "总记录数")
    private long total; //总记录数

    /**
     * 一页数据数
     */
    @Schema(name = "pageSize",description = "一页数据数")
    private long pageSize; //一页数据数

    /**
     * 总页数
     */
    @Schema(name = "totalPage",description = "总页数")
    private long totalPage; //总页数


    /**
     * 数据
     */
    @Schema(name = "list",description = "数据")
    private List list; //数据
}
