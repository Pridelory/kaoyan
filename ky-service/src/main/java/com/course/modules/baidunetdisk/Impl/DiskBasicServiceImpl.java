package com.course.modules.baidunetdisk.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.course.common.link.NetDiskBasicLink;
import com.course.common.utils.httpclient.HttpClientUtils;
import com.course.common.utils.httpclient.domain.HttpClientResult;
import com.course.modules.baidunetdisk.IDiskBasicService;
import com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo.*;
import com.course.modules.common.utils.QueryParameterHandleUtil;
import com.course.modules.baidunetdisk.entity.File;
import com.course.modules.baidunetdisk.entity.NetDiskInfo;
import com.course.modules.baidunetdisk.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * DiskBasicService实现类
 *
 * access_token暂留，完了会用全局拦截器解决
 */
@Service
public class DiskBasicServiceImpl implements IDiskBasicService {

    @Override
    public UserInfo getDiskUserInfo(String access_token) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(null);
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
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getNetDiskCapacity, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            NetDiskInfo netDiskInfo = JSON.parseObject(content, NetDiskInfo.class);
            return netDiskInfo;
        }
        return null;
    }

    @Override
    public List<File> getFileList(String access_token, FileListQueryVO queryVO) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getFileList, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            JSONObject jsonObject = (JSONObject) JSON.parse(content);
            JSONArray jsonArray = (JSONArray) jsonObject.get("list");
            List<File> fileList = jsonArray.toJavaList(File.class);
            return fileList;
        }
        return null;
    }

    @Override
    public List<File> getFileListRecursively(String access_token, FileListRecursivelyQueryVO queryVO) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getFileListRecursively, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            JSONObject jsonObject = (JSONObject) JSON.parse(content);
            JSONArray jsonArray = (JSONArray) jsonObject.get("list");
            List<File> fileList = jsonArray.toJavaList(File.class);
            return fileList;
        }
        return null;
    }

    @Override
    public List<File> getDocList(String access_token, DocListQueryVO queryVO) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getDocList, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            JSONObject jsonObject = (JSONObject) JSON.parse(content);
            JSONArray jsonArray = (JSONArray) jsonObject.get("info");
            List<File> docList = jsonArray.toJavaList(File.class);
            return docList;
        }
        return null;
    }

    @Override
    public List<File> getPicList(String access_token, PicListQueryVO queryVO) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getPicList, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            JSONObject jsonObject = (JSONObject) JSON.parse(content);
            JSONArray jsonArray = (JSONArray) jsonObject.get("info");
            List<File> picList = jsonArray.toJavaList(File.class);
            return picList;
        }
        return null;
    }

    @Override
    public List<File> getVideoList(String access_token, VideoListQueryVO queryVO) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.getVideoList, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            JSONObject jsonObject = (JSONObject) JSON.parse(content);
            JSONArray jsonArray = (JSONArray) jsonObject.get("info");
            List<File> videoList = jsonArray.toJavaList(File.class);
            return videoList;
        }
        return null;
    }

    @Override
    public List<File> searchFile(String access_token, SearchFileQueryVO queryVO) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doGet(NetDiskBasicLink.searchFile, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            JSONObject jsonObject = (JSONObject) JSON.parse(content);
            JSONArray jsonArray = (JSONArray) jsonObject.get("list");
            List<File> fileList = jsonArray.toJavaList(File.class);
            return fileList;
        }
        return null;
    }
}
