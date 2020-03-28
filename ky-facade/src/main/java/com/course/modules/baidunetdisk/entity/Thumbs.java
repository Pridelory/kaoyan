package com.course.modules.baidunetdisk.entity;

import lombok.Data;

/**
 * 缩略图
 *
 * 包含三个尺寸的缩略图URL
 */
@Data
public class Thumbs {

    private String url1;

    private String url2;

    private String url3;

    private String icon;
}
