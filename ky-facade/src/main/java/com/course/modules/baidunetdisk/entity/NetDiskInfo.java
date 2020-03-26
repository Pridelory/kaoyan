package com.course.modules.baidunetdisk.entity;

import lombok.Data;

/**
 * 网盘信息
 */
@Data
public class NetDiskInfo {

    /**
     * 总空间大小，单位B
     */
    Long total;

    /**
     * 7天内是否有容量到期
     */
    Boolean expire;

    /**
     * 已使用大小，单位B
     */
    Long used;

    /**
     * 剩余大小，单位B
     */
    Long free;
}
