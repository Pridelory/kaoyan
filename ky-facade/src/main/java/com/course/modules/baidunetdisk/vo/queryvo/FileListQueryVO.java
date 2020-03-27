package com.course.modules.baidunetdisk.vo.queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.QueryVO;
import lombok.Data;

/**
 * 获取（非递归）文件列表查询VO
 *
 * 所有属性为非必须
 */
@Data
public class FileListQueryVO extends QueryVO {

    /**
     * 需要list的目录，以/开头的绝对路径，默认为 /
     */
    private String dir;

    /**
     * 排序字段，time表示先按文件类型排序，后按修改时间排序，
     * name表示先按文件类型排序，后按文件名称排序，
     * size表示先按文件类型排序， 后按文件大小排序，默认为name
     */
    private String order;

    /**
     * 该KEY存在为降序，否则为升序
     */
    private String desc;

    /**
     * 起始位置， 从0开始
     */
    private Integer start;

    /**
     * 每页条目数，默认为1000，最大值为10000
     */
    private Integer limit;

    /**
     * 值为web时， 返回dir_empty 和 缩略图数据
     */
    private String web;

    /**
     * 是否只返回文件夹，1 只返回目录条目，且属性只返回path字段、0 返回所有
     */
    private Integer folder;

    /**
     * 是否返回 dir_empty 属性，1 返回、0 不返回
     */
    private Integer showempty;
}
