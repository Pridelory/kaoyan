package com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.PageQueryVO;
import lombok.Data;

/**
 * 图片列表查询VO
 */
@Data
public class PicListQueryVO extends PageQueryVO {

    /**
     * 值为web时，返回值增加thunbs字段
     */
    String web;

    /**
     * 目录名称，为空时，parent_path = "/" && recursion = 1
     */
    String parent_path;

    /**
     * 0 不递归、1 递归，默认0
     */
    Integer recursion;
}
