package com.common.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.CommonException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Pageable;
import java.util.List;

@Controller
public class BaseController {
    protected final static String PROJECT_PATH = System.getProperty("user.dir");//项目绝对路径

    /**
     * 获取当前登录用户信息
     *
     * @return
     * @throws CommonException
     */
    protected Integer getLoginUserId() {
        String id = "";//CookieUtil.getValue(getRequest(), CommonValues.COOKIE_KEY_ID);
        if (StringUtils.isEmpty(id)) {
            throw new CommonException(CommonException.NO_LOGIN);
        }
        return Integer.parseInt(id);
    }

    /**
     * 获取json数组
     *
     * @param data json对象
     * @param key  键
     * @param type 类型
     * @return
     */
    protected <T> List<T> getRequestList(JSONObject data, String key, Class<T> type) {
        if (data == null) {
            return null;
        }
        JSONArray jsonArray = data.getJSONArray(key);
        if (jsonArray == null) {
            return null;
        }
        return jsonArray.toJavaList(type);
    }

    /**
     * 获取对象从json字符串中
     *
     * @param data json对象
     * @param type 类型
     * @return
     */
    protected <T> T getRequestObject(JSONObject data, Class<T> type) {
        if (data == null) {
            return null;
        }
        return JSONObject.toJavaObject(data, type);
    }

    /**
     * 设置分页属性
     *
     * @param pageNum  当前页
     * @param pageSize 页面大小
     * @param total    总条数
     * @param data     数据
     * @return
     */
    protected ModelMap setPageable(int pageNum, int pageSize, int total, Pageable data) {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("pageNum", pageNum);
        modelMap.addAttribute("pageSize", pageSize);
        modelMap.addAttribute("total", total);
        modelMap.addAttribute("data", data);
        return modelMap;
    }

    /**
     * 获取request对象
     *
     * @return
     */
    protected HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes.getRequest();
    }

    /**
     * 获取render对象
     *
     * @return
     */
    protected HttpServletResponse getRespose() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes.getResponse();
    }

    /**
     * 校验对象是否为空,为空则抛出参数异常
     */
    protected void verifyTypeObject(Object... objects) throws CommonException {
        for (Object object : objects) {
            if (StringUtils.isEmpty(object)) {
                throw new CommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    /**
     * 校验Long是否为空,小于0,是则抛出参数异常
     */
    protected void verifyTypeLong(Long... ids) throws CommonException {
        for (Long id : ids) {
            if (id == null || id <= 0) {
                throw new CommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    /**
     * 校验整形是否为空,小于0,是则抛出参数异常
     */
    protected void verifyTypeInteger(Integer... ids) throws CommonException {
        for (Integer id : ids) {
            if (id == null || id <= 0) {
                throw new CommonException(CommonException.SYS_PARAM_INVALID);
            }
        }
    }

    /**
     * 校验集合是否为空,为空则抛出参数异常
     */
    protected void verifyTypeList(List<?> list) throws CommonException {
        if (list == null || list.size() < 1) {
            throw new CommonException(CommonException.SYS_PARAM_INVALID);
        }
    }
}