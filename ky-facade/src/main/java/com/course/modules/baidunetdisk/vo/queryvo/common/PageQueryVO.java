package com.course.modules.baidunetdisk.vo.queryvo.common;

import lombok.Data;

/**
 * 分页查询VO
 *
 * 公共字段
 */
@Data
public class PageQueryVO extends QueryVO {

    /**
     * 页码，从1开始
     */
    private Integer page;

    /**
     * 每页返回的页码数， 默认值为1000, 最大值为10000
     */
    private Integer num;

    /**
     * 排序字段：time按修改时间排序，name按文件名称排序，size按文件大小排序，默认为time
     */
    private String order;

    /**
     * 1 为降序， 0为升序， 默认 1
     */
    private String desc;
}
