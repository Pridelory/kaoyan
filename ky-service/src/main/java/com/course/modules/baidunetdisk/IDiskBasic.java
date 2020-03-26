package com.course.modules.baidunetdisk;

import com.course.modules.baidunetdisk.entity.NetDiskInfo;
import com.course.modules.baidunetdisk.entity.UserInfo;
import com.course.modules.baidunetdisk.vo.queryvo.NetDiskInfoQueryVO;

/**
 * 百度网盘基础服务
 */
public interface IDiskBasic {

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
}
