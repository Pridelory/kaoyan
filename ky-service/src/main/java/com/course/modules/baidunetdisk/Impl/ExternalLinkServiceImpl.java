package com.course.modules.baidunetdisk.Impl;

import com.alibaba.fastjson.JSON;
import com.course.common.link.ExternalLinkLink;
import com.course.common.utils.httpclient.HttpClientUtils;
import com.course.common.utils.httpclient.domain.HttpClientResult;
import com.course.modules.baidunetdisk.IExternalLinkService;
import com.course.modules.baidunetdisk.entity.ExternalLink;
import com.course.modules.baidunetdisk.vo.queryvo.netdisk_externallink_queryvo.CreateExternalLinkQueryVO;
import com.course.modules.common.utils.QueryParameterHandleUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExternalLinkServiceImpl implements IExternalLinkService {

    @Override
    public ExternalLink createExternalLink(String access_token, CreateExternalLinkQueryVO queryVO) throws Exception {
        Map<String, String> params = QueryParameterHandleUtil.handleQueryParameter(queryVO);
        params.put("access_token", access_token);
        HttpClientResult httpClientResult = HttpClientUtils.doPost(ExternalLinkLink.createExternalLink, params);
        if ("200".equals(String.valueOf(httpClientResult.getCode()))) {
            // 接口请求成功
            String content = httpClientResult.getContent();
            ExternalLink externalLink = JSON.parseObject(content, ExternalLink.class);
            return externalLink;
        }
        return null;
    }
}
