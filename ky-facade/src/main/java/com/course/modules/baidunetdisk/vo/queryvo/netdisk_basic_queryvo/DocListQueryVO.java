package com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.PageQueryVO;
import lombok.Data;

/**
 * 获取文档列表查询VO
 */
@Data
public class DocListQueryVO extends PageQueryVO {

    /**
     * 目录名称，默认为/
     */
    private String parent_path;

    /**
     * 为1时返回文档预览地址lodocpreview
     */
    private Integer web;
}
