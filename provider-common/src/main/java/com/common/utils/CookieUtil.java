package com.common.utils;

import org.springframework.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
    /**
     * 添加cookie，浏览器关闭后失效
     *
     * @param response
     * @param name
     * @param value
     */
    public static void addCookie(HttpServletResponse response, String name, String value) {
        setCookie(response, name, value, -1);
    }

    /**
     * 删除某一个cookie
     *
     * @param response
     * @param name
     */
    public static void removeCookie(HttpServletResponse response, String name) {
        setCookie(response, name, null, 0);
    }

    /**
     * 删除所有cookie
     *
     * @param request
     * @param response
     */
    public static void removeAllCookies(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();

        if (null != cookies) {
            for (Cookie cookie : cookies) {
                setCookie(response, cookie.getName(), null, 0);
            }
        }
    }

    /**
     * 设置cookie，并设置有效期
     * maxage：负数浏览器关闭，正数单位是秒，0表示删除
     *
     * @param response
     * @param name
     * @param value
     */
    public static void setCookie(HttpServletResponse response, String name, String value, int maxage) {
        if (response != null && !StringUtils.isEmpty(name)) {
            Cookie cookie = new Cookie(name, value);
            cookie.setMaxAge(maxage);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }

    /**
     * 获取一个cookie的值
     *
     * @param request
     * @param name
     * @return
     */
    public static String getValue(HttpServletRequest request, String name) {
        if (name != null && request != null && request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if (name.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}