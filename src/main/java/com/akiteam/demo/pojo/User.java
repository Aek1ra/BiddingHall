package com.akiteam.demo.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Tag(name = "用户登录实体类")
public class User {
    /**
     * 用户昵称
     */
    @Schema(name = "name",description = "用户昵称")
    private String name;

    /**
     * 用户地区
     */
    @Schema(name = "loginLocation",description = "用户地区")
    private String loginLocation;

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
