package com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.QueryVO;
import lombok.Data;

/**
 * 网盘信息查询VO
 */
@Data
public class NetDiskInfoQueryVO extends QueryVO {

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
