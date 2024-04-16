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
@Schema(name = "首页商品总数")
public class IndexGoodsTotal {
    /**
     * 商品总数
     */
    @Schema(name = "goodsTotal",description = "商品总数")
    private String goodsTotal;
}
