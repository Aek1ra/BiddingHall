package com.akiteam.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@Schema(name = "用户信息表")
@TableName(value = "sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = -40356785423868312L;

    /**
     * 唯一标识ID
     */
    @Schema(name = "唯一标识ID")
    private Integer userId;

    /**
     * 用户名
     */
    @Schema(name = "用户名")
    private String userName;

    /**
     * 昵称
     */
    @Schema(name = "昵称")
    private String nickName;

    /**
     * 用户性别（0男，1女，2未知）
     */
    @Schema(name = "用户性别(0 男 ,1 女,2 未知(隐藏)性别)")
    private Integer gender;

    /**
     * 密码
     */
    @Schema(name = "密码")
    private String password;

    /**
     * 电话
     */
    @Schema(name = "电话")
    private String phone;

    /**
     * 状态
     */
    @Schema(name = "用户状态")
    private Integer status;

    /**
     * 用户地址
     */
    @Schema(name = "用户地址")
    private String address;
}
