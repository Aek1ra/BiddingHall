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
@Schema(name = "报价信息表")
@TableName(value = "auction_info")
public class AuctionInfo {

    /**
     * 竞价信息id
     */
    @Schema(name = "id",description = "竞价信息id")
    private Integer id;

    /**
     * 竞价商品id
     */
    @Schema(name = "goodsId",description = "竞价商品id")
    private Integer goodsId;

    /**
     * 竞价商品名称
     */
    @Schema(name = "goodsName",description = "竞价商品名称")
    private String goodsName;

    /**
     * 报价数量
     */
    @Schema(name = "auctionNum",description = "报价数量")
    private Integer auctionNum;

    /**
     * 报价金额
     */
    @Schema(name = "auctionPrice",description = "报价金额")
    private BigDecimal auctionPrice;

    /**
     * 报价时间
     */
    @Schema(name = "auctionTime",description = "报价时间")
    private Timestamp auctionTime;

    /**
     * 竞价发起者的用户id
     */
    @Schema(name = "auctionUserId",description = "竞价发起者的用户id")
    private Integer auctionUserId;

    /**
     * 备注
     */
    @Schema(name = "remark",description = "备注")
    private String remark;


}
