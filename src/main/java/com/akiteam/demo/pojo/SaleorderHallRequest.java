package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "竞价大厅分页请求类")
public class SaleorderHallRequest {

    /**
     * 页码
     */
    @Schema(name = "页码")
    private Integer limit;

    /**
     * 页数
     */
    @Schema(name = "页数")
    private Integer pages;
}
