package com.course.modules.baidunetdisk.entity;

import lombok.Data;

/**
 * 外链
 */
@Data
public class ExternalLink {

    /**
     * 外链id
     */
    private Long shareid;

    /**
     * 外链地址，其中短链地址为/s/1后面内容
     */
    private String link;

    /**
     * 外链有效期，0 永久、1 1天、7 7天
     */
    private Integer expiredType;
}
