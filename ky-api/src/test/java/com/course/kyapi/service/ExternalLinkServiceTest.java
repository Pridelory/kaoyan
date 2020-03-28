package com.course.kyapi.service;

import com.course.kyapi.ApiTestBase;
import com.course.modules.baidunetdisk.IExternalLinkService;
import com.course.modules.baidunetdisk.entity.ExternalLink;
import com.course.modules.baidunetdisk.vo.queryvo.netdisk_externallink_queryvo.CreateExternalLinkQueryVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.tools.JavaCompiler;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ExternalLinkServiceTest extends ApiTestBase {

    @Autowired
    private IExternalLinkService externalLinkService;

    private static final String access_token = "123.1281ca5a046f5fed5ff71cc29fddb36d.YloHy5V6hUuTuDvvIY1pFkC7mrHOjXyWaymYMWA.nqOMGw";

    @Test
    public void test_createExternalLink() throws Exception {
        CreateExternalLinkQueryVO createExternalLinkQueryVO = new CreateExternalLinkQueryVO();
        createExternalLinkQueryVO.setFid_list(new String[] {"1073017922483471"});
        createExternalLinkQueryVO.setChannel_list(new String[] {});
        createExternalLinkQueryVO.setSchannel(4);
        createExternalLinkQueryVO.setPwd("1234");
        ExternalLink externalLink = externalLinkService.createExternalLink(access_token, createExternalLinkQueryVO);
        System.out.println(externalLink);
    }

//    @Test
//    public void test() {
//        CreateExternalLinkQueryVO createExternalLinkQueryVO = new CreateExternalLinkQueryVO();
//        Class<? extends CreateExternalLinkQueryVO> clazz = createExternalLinkQueryVO.getClass();
//        Field[] declaredFields = clazz.getDeclaredFields();
//        for (Field field : declaredFields) {
//            System.out.println(field.getGenericType().getTypeName());
//        }
//    }
}
