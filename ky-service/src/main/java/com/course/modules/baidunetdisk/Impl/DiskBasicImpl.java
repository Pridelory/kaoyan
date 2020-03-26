package com.course.modules.baidunetdisk.Impl;

import com.alibaba.fastjson.JSON;
import com.course.common.link.NetDiskBasicLink;
import com.course.common.utils.httpclient.HttpClientUtils;
import com.course.common.utils.httpclient.domain.HttpClientResult;
import com.course.modules.baidunetdisk.IDiskBasic;
import com.course.modules.baidunetdisk.entity.NetDiskInfo;
import com.course.modules.baidunetdisk.entity.UserInfo;
import com.course.modules.baidunetdisk.vo.queryvo.NetDiskInfoQueryVO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DiskBasicImpl implements IDiskBasic {

    @Override
    public UserInfo getDiskUserInfo(String access_token) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getUserInfo, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            UserInfo userInfo = JSON.parseObject(content, UserInfo.class);
            return userInfo;
        }
        return null;
    }

    @Override
    public NetDiskInfo getNetDiskInfo(String access_token, NetDiskInfoQueryVO queryVO) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("access_token", access_token);
        if (null != queryVO && null != queryVO.getCheckfree()) {
            params.put("checkfree", String.valueOf(queryVO.getCheckfree()));
        }
        if (null != queryVO && null != queryVO.getCheckexpire()) {
            params.put("checkexpire", String.valueOf(queryVO.getCheckexpire()));
        }
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getNetDiskCapacity, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            NetDiskInfo netDiskInfo = JSON.parseObject(content, NetDiskInfo.class);
            return netDiskInfo;
        }
        return null;
    }
}
