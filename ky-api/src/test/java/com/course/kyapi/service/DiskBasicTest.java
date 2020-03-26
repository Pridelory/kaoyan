package com.course.kyapi.service;

import com.course.kyapi.ApiTestBase;
import com.course.modules.baidunetdisk.IDiskBasic;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * DiskBasic service测试
 */
public class DiskBasicTest extends ApiTestBase {

    @Autowired
    private IDiskBasic diskBasic;

    private static final String access_token = "123.1281ca5a046f5fed5ff71cc29fddb36d.YloHy5V6hUuTuDvvIY1pFkC7mrHOjXyWaymYMWA.nqOMGw";

    @Test
    public void test_getDiskUserInfo() throws Exception {
        diskBasic.getDiskUserInfo(access_token);
    }

    @Test
    public void test_getNetDiskInfo() throws Exception {
        diskBasic.getNetDiskInfo(access_token, null);
    }

}
