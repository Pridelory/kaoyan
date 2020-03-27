package com.course.modules.baidunetdisk.entity;

import lombok.Data;


/**
 * 百度网盘文件
 */
@Data
public class File {

    /**
     * 文件在云端的唯一标识ID
     */
    private Long fs_id;

    /**
     * 文件的绝对路径
     */
    private String path;

    /**
     * 文件名称
     */
    private String server_filename;

    /**
     * 文件类型，1 视频、2 音频、3 图片、4 文档、5 应用、6 其他、7 种子
     */
    private Integer category;

    /**
     * 文件大小，单位B
     */
    private Long size;

    /**
     * 文件在服务器修改时间
     */
    private Long server_mtime;

    /**
     * 文件在服务器创建时间
     */
    private Long server_ctime;

    /**
     * 文件在客户端修改时间
     */
    private Long local_mtime;

    /**
     * 文件在客户端创建时间
     */
    private Long local_ctime;

    /**
     * 文件的md5值，只有是文件类型时，该KEY才存在
     */
    private String md5;

    /**
     * 是否目录，0 文件、1 目录
     */
    private Integer isdir;

    /**
     * 该目录是否存在子目录，只有请求参数带WEB且该条目为目录时，该KEY才存在
     */
    private Integer dir_empty;

    /**
     * 只有请求参数带WEB且该条目分类为图片时，该KEY才存在，包含三个尺寸的缩略图URL
     */
    private Thumbs thumbs;

    /**
     * 对象key
     */
    private String Object_key;
}
