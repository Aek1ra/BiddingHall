package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Schema(name = "用户登录信息")
public class UserLoginInfo {

    /**
     * 用户账号
     */
    @Schema(name = "account",description = "用户账号")
    private String account;

    /**
     * 用户密码
     */
    @Schema(name = "password",description = "用户密码")
    private String password;
}
