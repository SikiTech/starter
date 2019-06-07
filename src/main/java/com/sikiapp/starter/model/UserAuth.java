package com.sikiapp.starter.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * user_auth
 * @author 
 */
@Getter
@Setter
@ToString
public class UserAuth implements Serializable {
    /**
     * 自增Id
     */
    private Integer id;

    /**
     * 用户id FK
     */
    private Integer user;

    /**
     * 授权类型：1手机号 2用户名 3微信 4微博 5qq
     */
    private Byte identityType;

    /**
     * 用户名、手机号或第三方应用的唯一标识
     */
    private String identifier;

    /**
     * 密码凭证(站内的使用MD5保存密码,站外的保存第三方token)
     */
    private String certificate;

    /**
     * 第三方昵称（第三方为空）
     */
    private String name;

    /**
     * 第三方获取的性别 男 女
     */
    private String gender;

    /**
     * 第三方头像
     */
    private String face;


}