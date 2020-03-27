package com.course.modules.baidunetdisk;

import com.course.modules.baidunetdisk.entity.File;
import com.course.modules.baidunetdisk.entity.NetDiskInfo;
import com.course.modules.baidunetdisk.entity.UserInfo;
import com.course.modules.baidunetdisk.vo.queryvo.*;

import java.util.List;

/**
 * 百度网盘基础服务
 */
public interface IDiskBasicService {

    /**
     * 获取网盘用户信息
     * @param access_token
     * @return
     */
    UserInfo getDiskUserInfo(String access_token) throws Exception;

    /**
     * 获取网盘信息
     * @param access_token
     * @param queryVO
     * @return
     */
    NetDiskInfo getNetDiskInfo(String access_token, NetDiskInfoQueryVO queryVO) throws Exception;

    /**
     * 获取文件列表
     * @param access_token
     * @return
     * @throws Exception
     */
    List<File> getFileList(String access_token, FileListQueryVO queryVO) throws Exception;

    /**
     * 递归获取文件列表
     * @return
     * @throws Exception
     */
    List<File> getFileListRecursively(String access_token, FileListRecursivelyQueryVO queryVO) throws Exception;

    /**
     * 获取文档列表
     * @param access_token
     * @param queryVO
     * @return
     * @throws Exception
     */
    List<File> getDocList(String access_token, DocListQueryVO queryVO) throws Exception;

    /**
     * 获取图片列表
     * @param access_token
     * @return
     * @throws Exception
     */
    List<File> getPicList(String access_token, PicListQueryVO queryVO) throws Exception;

    /**
     * 获取视频列表
     * @param access_token
     * @return
     * @throws Exception
     */
    List<File> getVideoList(String access_token, VideoListQueryVO queryVO) throws Exception;
}
