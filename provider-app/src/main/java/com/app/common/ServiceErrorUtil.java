package com.app.common;

import org.springframework.util.StringUtils;

import java.util.List;

public class ServiceErrorUtil {

    public static void errObj(Object... objs) {
        for (Object obj : objs) {
            if (StringUtils.isEmpty(obj)) {
                throw new CommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    public static void errInteger(Integer... ids) {
        for (Integer id : ids) {
            if (id == null || id < 0) {
                throw new CommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    public static void errLong(Long... ids) {
        for (Long id : ids) {
            if (id == null || id < 0) {
                throw new CommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    public static void errList(List<?>... lists) {
        for (List<?> list : lists) {
            if (list == null || list.size() < 1) {
                throw new CommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    public static void operErrInteger(Integer result) {
        if (result < 1) {
            throw new CommonException(CommonException.ERROR_OPER_FAIL);
        }
    }

    public static void operErrBoolean(Boolean result) {
        if (!result) {
            throw new CommonException(CommonException.ERROR_OPER_FAIL);
        }
    }
}