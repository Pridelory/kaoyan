package com.course.kyapi.util;

import com.course.modules.common.utils.QueryParameterHandleUtil;
import com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo.FileListQueryVO;
import org.junit.Test;

import java.util.Map;

public class UtilTest {

    /**
     * 测试工具类QueryParameterHandleUtil
     */
    @Test
    public void testQueryParameterHandleUtil() {
        FileListQueryVO fileListQueryVO = new FileListQueryVO();
        fileListQueryVO.setDesc("describe");
        fileListQueryVO.setDir("/ss/aa");
        fileListQueryVO.setLimit(1);

        Map map = QueryParameterHandleUtil.handleQueryParameter(fileListQueryVO);
        System.out.println(map);
    }
}
