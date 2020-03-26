package com.course.modules.baidunetdisk.entity;

import lombok.Data;

/**
 * 百度网盘用户信息
 */
@Data
public class UserInfo {

    /**
     * 百度账号
     */
    String baidu_name;

    /**
     * 网盘账号
     */
    String netdisk_name;

    /**
     * 头像地址
     */
    String avatar_url;

    /**
     * 会员类型，0普通用户、1普通会员、2超级会员
     */
    Integer vip_type;

    /**
     * 用户ID
     */
    Integer uk;
}
