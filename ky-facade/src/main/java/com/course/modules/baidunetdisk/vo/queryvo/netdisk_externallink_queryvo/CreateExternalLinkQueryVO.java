package com.course.modules.baidunetdisk.vo.queryvo.netdisk_externallink_queryvo;

import com.course.modules.baidunetdisk.vo.queryvo.common.QueryVO;
import lombok.Data;

/**
 * 创建外链查询VO
 */
@Data
public class CreateExternalLinkQueryVO extends QueryVO {

    /**
     * 文件fsid数组，fsid为uint64类型，个数上限1000
     *
     * 必需
     */
    private String[] fid_list;

    /**
     * 分享途径，固定值：4
     *
     * 必需
     */
    private Integer schannel;

    /**
     * 分享途径信息，固定值：[]
     *
     * 必需
     */
    private String[] channel_list;

    /**
     * 4位数字字母验证码，schannel=4时必需，不能为完全相同的字母
     *
     * 可能必需
     */
    private String pwd;

    /**
     * 外链有效期，0 永久、1 1天、7 7天，默认0
     */
    private Integer period;

    /**
     * 外链来自第三方平台标记为，线下分配
     */
    private Integer third_type;
}
