package com.course.modules.baidunetdisk.vo.queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.QueryVO;
import lombok.Data;

/**
 * 递归获取文件列表查询VO
 */
@Data
public class FileListRecursivelyQueryVO extends QueryVO {

    /**
     * 目录名称
     *
     * 必填字段
     */
    private String path;

    /**
     * 排序字段，time(修改时间)，name(文件名)，size(大小)，默认为文件类型
     *
     * 非必填字段
     */
    private String order;

    /**
     * 0 升序，1 降序，默认0
     *
     * 非必填字段
     */
    private String desc;

    /**
     * 查询起点，默认0
     *
     * 非必填字段
     */
    private Integer start;

    /**
     * 查询数目，默认1
     *
     * 非必填字段
     */
    private Integer limit;

    /**
     * 是否递归，0 否，1 是，默认0
     *
     * 非必填字段
     */
    private Integer recursion;

    /**
     * 文件上传时间，设置此参数，表示只返回上传时间大于ctime的文件
     *
     * 非必填字段
     */
    private Integer ctime;

    /**
     * 文件修改时间，设置此参数，表示只返回修改时间大于ctime的文件
     *
     * 非必填字段
     */
    private Integer mtime;

    /**
     * 为1时返回缩略图地址
     *
     * 非必填字段
     */
    private Integer web;
}
