package com.common.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.CommonException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;

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
            CommonException.throwNewCommonException("请先登录");
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
}