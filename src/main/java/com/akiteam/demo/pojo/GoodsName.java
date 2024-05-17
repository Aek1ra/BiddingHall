package com.akiteam.demo.pojo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "商品名称")
public class GoodsName {

    /**
     * 商品名称
     */
    @Schema(name = "goodsName",description = "商品名称")
    private String goodsName;

    /**
     * 一共多少页
     */
    @Schema(name = "pageNum",description = "一共多少页")
    private Integer pageNum;

    /**
     * 每页多少数据
     */
    @Schema(name = "pageSize",description = "每页多少数据")
    private Integer pageSize;

}
