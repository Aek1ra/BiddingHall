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
@Schema(name = "通知信息ID")
public class InfoId {

    /**
     * 状态码
     */
    @Schema(name = "InfoId",description = "通知信息ID")
    private Integer InfoId;

}
