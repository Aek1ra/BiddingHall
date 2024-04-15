package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "客流量")
public class PassengerFlowAndSalesVolume {

    /**
     * 客流量
     */
    @Schema(name = "passengerFlow",description = "客流量")
    private Integer passengerFlow;

    /**
     * 销售额
     */
    @Schema(name = "salesVolume",description = "销售额")
    private Integer salesVolume;
}
