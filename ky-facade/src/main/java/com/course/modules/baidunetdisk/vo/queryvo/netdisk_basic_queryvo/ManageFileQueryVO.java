package com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo;

/**
 * 文件操作查询VO
 */
public class ManageFileQueryVO {

    /**
     * copy、move、rename、delete
     *
     * 必需字段
     */
    private String opera;

    /**
     * 0 同步、1 自适应、2 异步
     */
    private Integer async;

    /**
     * 遇到重复文件的处理策略,
     * fail(默认，直接返回失败)、newcopy(重命名文件)、overwrite、skip
     */
    private String ondup;


}
