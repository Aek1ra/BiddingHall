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
@Schema(name = "用户id")
public class UserId {
    /**
     * 用户ID
     */
    @Schema(name = "userId",description = "用户ID")
    private Integer userId;
}
