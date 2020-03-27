package com.course.modules.common.utils;

import com.course.modules.baidunetdisk.vo.queryvo.common.QueryVO;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 查询参数处理工具
 *
 * @author wangmeng
 * @since 2020-03-27
 */
public class QueryParameterHandleUtil {

    /**
     * 根据QueryVO构造查询Map
     *
     * 不为空的参数会被设置进Map
     * @param queryVO
     * @return
     */
    public static Map handleQueryParameter(QueryVO queryVO) {
        HashMap<String, String> parameterMap = new HashMap<>(16);
        // 没有查询参数
        if (queryVO == null) return parameterMap;
        List<Field> fieldList = new ArrayList<>(16) ;
        Class<? extends QueryVO> clazz = queryVO.getClass();
        Class tempClazz = clazz;
        // 递归获取父类
        while (null != tempClazz) {
            fieldList.addAll(new ArrayList<>(Arrays.asList(tempClazz.getDeclaredFields())));
            tempClazz = tempClazz.getSuperclass();
        }

        // 遍历fieldList非空的field
        // 把其设置到parameterMap中
        for (Field field : fieldList) {
            field.setAccessible(true);
            try {
                if (null == field.get(queryVO) || "".equals(field.get(queryVO))) {
                    continue;
                } else {
                    parameterMap.put(field.getName(), String.valueOf(field.get(queryVO)));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return parameterMap;
    }
}
