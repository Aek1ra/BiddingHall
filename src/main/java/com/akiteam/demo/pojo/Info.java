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
@Schema(name = "获取通知信息标题")
public class Info {
    /**
     * 用户ID
     */
    @Schema(name = "userId",description = "用户ID")
    private Integer userId;

    /**
     * 状态码
     */
    @Schema(name = "Status",description = "状态码")
    private Integer Status;
}
