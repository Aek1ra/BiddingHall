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
@Schema(name = "提醒信息总数")
public class IndexRemindTotal {
    /**
     * 提醒信息总数
     */
    @Schema(name = "remindTotal",description = "提醒信息总数")
    private Integer remindTotal;
}
