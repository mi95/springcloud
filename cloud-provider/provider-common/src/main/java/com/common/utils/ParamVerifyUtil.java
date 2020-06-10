package com.common.utils;

import java.util.List;


public class ParamVerifyUtil {
    /**
     * 判断集合是否为空
     *
     * @param list
     * @return
     */
    public static boolean verifyList(List<?> list) {
        return list == null || list.size() < 1;
    }

    /**
     * 校验Integer 整形 null或<0 返回true
     *
     * @param ids
     * @return
     */
    public static boolean verifyInteger(Integer... ids) {
        for (Integer id : ids) {
            if (id == null || id < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 校验Long 长整形 null或<0 返回false
     *
     * @param ids
     * @return
     */
    public static boolean verifyLong(Long... ids) {
        for (Long id : ids) {
            if (id == null || id < 0) {
                return false;
            }
        }
        return true;
    }

    public static <T> void verifyT(T... values) {
        for (T value : values) {
            if (value == null || value == "") {
                CommonException.throwNewCommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    public static <T> boolean verifyTBoolean(T... values) {
        for (T value : values) {
            if (value == null || value == "") {
                return false;
            }
        }
        return true;
    }
}