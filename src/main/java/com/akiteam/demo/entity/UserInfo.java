package com.akiteam.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@Schema(name = "用户信息表")
@TableName(value = "user_info")
public class UserInfo {

    /**
     * 用户id
     */
    @Schema(name = "id",description = "用户id")
    private Integer id;

    /**
     * 用户名称
     */
    @Schema(name = "name",description = "用户名称")
    private String name;

    /**
     * 用户权限
     */
    @Schema(name = "role",description = "用户权限")
    private Integer role;

    /**
     * 用户登录时间
     */
    @Schema(name = "loginTime",description = "登录时间")
    private Timestamp loginTime;

    /**
     * 用户登陆地点/地址
     */
    @Schema(name = "loginLocation",description = "用户登陆地点/地址")
    private String loginLocation;

    /**
     * 用户注册时间
     */
    @Schema(name = "createTime",description = "用户注册时间")
    private Timestamp createTime;

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
