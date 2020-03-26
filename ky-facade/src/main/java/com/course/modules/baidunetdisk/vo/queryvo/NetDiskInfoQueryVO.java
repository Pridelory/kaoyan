package com.course.modules.baidunetdisk.vo.queryvo;

import lombok.Data;

/**
 * 网盘信息查询VO
 */
@Data
public class NetDiskInfoQueryVO {

    /**
     * 检查免费信息
     *
     * 必须：否
     */
    Integer checkfree;

    /**
     * 检查过期信息
     *
     * 必须：否
     */
    Integer checkexpire;
}
