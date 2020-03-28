package com.course.common.link;

/**
 * 百度网盘外链链接
 */
public class ExternalLinkLink {

    /**
     * 创建外链
     */
    public static final String createExternalLink = "https://pan.baidu.com/rest/2.0/xpan/share?method=set";

    /**
     * 外链密码验证
     */
    public static final String externalLinkPasswordValidation = "https://pan.baidu.com/rest/2.0/xpan/share?method=verify";

    /**
     * 获取外链中的文件列表
     */
    public static final String getExternalLinkFileList = "https://pan.baidu.com/rest/2.0/xpan/share?method=list";

    /**
     * 查询外链详细信息
     */
    public static final String externalLinkDetailInfo = "https://pan.baidu.com/api/shorturlinfo";

    /**
     * 外链文件转存
     */
    public static final String externalLinkFileTransfer = "https://pan.baidu.com/rest/2.0/xpan/share?method=transfer";
}
