package com.course.common.link;

/**
 * 百度网盘基本功能链接
 */
public class NetDiskBasicLink {

    /**
     * 获取百度网盘用户链接
     */
    public static final String getUserInfo = "https://pan.baidu.com/rest/2.0/xpan/nas?method=uinfo";

    /**
     * 获取百度网盘容量信息链接
     */
    public static final String getNetDiskCapacity = "https://pan.baidu.com/api/quota";

    /**
     * 获取文件列表
     */
    public static final String getFileList = "https://pan.baidu.com/rest/2.0/xpan/file?method=list";

    /**
     * 递归获取文件列表
     */
    public static final String getFileListRecursively = "https://pan.baidu.com/rest/2.0/xpan/multimedia?method=listall";


    /**
     * 获取文档列表
     */
    public static final String getDocList = "https://pan.baidu.com/rest/2.0/xpan/file?method=doclist";

    /**
     * 获取图片列表
     */
    public static final String getPicList = "https://pan.baidu.com/rest/2.0/xpan/file?method=imagelist";

    /**
     * 获取视频列表
     */
    public static final String getVideoList = "https://pan.baidu.com/rest/2.0/xpan/file?method=videolist";

    /**
     * 获取分类文件总个数
     */
    public static final String getCategoryinfo = "https://pan.baidu.com/api/categoryinfo";

    /**
     * 获取分类列表文件
     */
    public static final String getCategoryList = "https://pan.baidu.com/rest/2.0/xpan/multimedia?method=categorylist";

    /**
     * 搜索文件
     */
    public static final String searchFile = "https://pan.baidu.com/rest/2.0/xpan/file?method=search";

    /**
     * 文件操作
     */
    public static final String manageFile = "https://pan.baidu.com/rest/2.0/xpan/file?method=filemanager";

    /**
     * 查询文件信息
     */
    public static final String searchFileMetas = "https://pan.baidu.com/rest/2.0/xpan/multimedia?method=filemetas";
}
