package com.course.modules.baidunetdisk;

import com.course.modules.baidunetdisk.entity.ExternalLink;
import com.course.modules.baidunetdisk.vo.queryvo.netdisk_externallink_queryvo.CreateExternalLinkQueryVO;

/**
 * 外链能力接口
 */
public interface IExternalLinkService {

    /**
     * 创建外链
     * @param access_token
     * @param queryVO
     * @return
     */
    ExternalLink createExternalLink(String access_token, CreateExternalLinkQueryVO queryVO) throws Exception;


}
