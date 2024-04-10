package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(name = "PageHelper实体类")
public class PageHelperPojo {
    /**
     * 一共多少页
     */
    @Schema(name = "pageNum",description = "一共多少页")
    Integer pageNum;

    /**
     * 每页多少数据
     */
    @Schema(name = "pageSize",description = "每页多少数据")
    Integer pageSize;
}
