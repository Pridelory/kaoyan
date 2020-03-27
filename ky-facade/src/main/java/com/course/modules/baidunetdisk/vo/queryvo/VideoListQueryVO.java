package com.course.modules.baidunetdisk.vo.queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.PageQueryVO;
import lombok.Data;

/**
 * 视频列表查询VO
 */
@Data
public class VideoListQueryVO extends PageQueryVO {

    /**
     * 值为web时，返回值增加thunbs字段
     */
    String web;

    /**
     * 目录名称，为空时，parent_path = "/" && recursion = 1
     */
    String parent_path;
}
