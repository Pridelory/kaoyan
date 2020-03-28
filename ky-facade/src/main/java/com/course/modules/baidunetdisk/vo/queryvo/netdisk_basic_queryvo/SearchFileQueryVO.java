package com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.QueryVO;
import lombok.Data;

@Data
public class SearchFileQueryVO extends QueryVO {

    /**
     * 搜索目录，默认根目录
     */
    private String dir;

    /**
     * 搜索关键字
     *
     * 必需
     */
    private String key;

    /**
     * 是否递归，1 递归、0 不递归，默认0
     */
    private Integer recursion;

    /**
     * 页数，从1开始，缺省则返回所有条目
     */
    private Integer page;

    /**
     * 每页条目数，默认为1000，最大值为1000
     */
    private Integer num;

    /**
     * 默认0，为1时返回缩略图信息
     */
    private Integer web;
}
