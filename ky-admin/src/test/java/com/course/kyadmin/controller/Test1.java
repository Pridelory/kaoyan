package com.course.kyadmin.controller;

import com.course.kyadmin.AdminTestBase;
import com.course.modules.baidunetdisk.IDiskBasicService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Test1 extends AdminTestBase {

    @Autowired
    private IDiskBasicService diskBasic;

    @Test
    public void test() throws Exception {
        diskBasic.getDiskUserInfo("ssss");
    }
}
