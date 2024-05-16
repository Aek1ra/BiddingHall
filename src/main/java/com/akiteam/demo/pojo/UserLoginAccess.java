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
@Schema(name = "用户登录验证")
public class UserLoginAccess {

    /**
     * 用户ID
     */
    @Schema(name = "userId",description = "用户ID")
    private Integer userId;

    /**
     * 用户登录信息
     */
    @Schema(name = "msg",description = "用户登录信息")
    private String msg;
}
