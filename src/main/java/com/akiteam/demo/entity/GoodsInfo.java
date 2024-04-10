package com.akiteam.demo.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.sql.Timestamp;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@Schema(name = "商品信息表")
@TableName(value = "goods_info")
public class GoodsInfo {

    /**
     * 商品id 主键
     */
    @Schema(name = "id",description = "商品id 主键")
    private Integer id;

    /**
     * 商品名称
     */
    @Schema(name = "goodsName",description = "商品名称")
    private String goodsName;

    /**
     * 商品总数
     */
    @Schema(name = "total",description = "商品总数")
    private Integer total;

    /**
     * 商品起拍价格
     */
    @Schema(name = "price",description = "商品起拍价格")
    private BigDecimal price;

    /**
     * 0-单向竞价 1-累计竞价 2-一次报价
     */
    @Schema(name = "type",description = "竞价类型")
    private Integer type;

    /**
     * 开始时间
     */
    @Schema(name = "startTime",description = "开始时间")
    private Timestamp startTime;

    /**
     * 结束时间
     */
    @Schema(name = "endTime",description = "结束时间")
    private Timestamp endTime;

    /**
     * 0-即将开始 1-公示中 2-交易中 3-已结束(已拍卖出去)
     */
    @Schema(name = "status",description = "商品状态")
    private Integer status;

    /**
     * 0-进入大厅 1-报名 2-查看趋势 3-已结束
     */
    @Schema(name = "operation",description = "用户状态")
    private Integer operation;
}
