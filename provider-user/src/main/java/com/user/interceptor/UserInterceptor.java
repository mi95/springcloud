package com.user.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Enumeration;

/**
 * 拦截器
 * 打印请求信息，登录验证
 */
public class UserInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(getClass());

    // 在请求处理之前进行调用（Controller方法调用之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 所有请求第一个进入的方法
        String reqURL = request.getRequestURL().toString();
        String ip = request.getRemoteHost();
        StringBuilder responseStrBuilder = new StringBuilder();
        //获取json请求参数
//        String params = new BodyReaderHttpServletRequestWrapper(request).getPara();
//        responseStrBuilder.append(params);
        //获取非json格式参数
        Enumeration<String> keys = request.getParameterNames();
        while (keys.hasMoreElements()) {
            String k = keys.nextElement();
            responseStrBuilder.append(k).append(":").append(request.getParameter(k)).append(" ");
        }
        String parmeter = responseStrBuilder.toString();

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        if (handler instanceof HandlerMethod) {
            StringBuilder sb = new StringBuilder();
            sb.append("Springboot Web------------------").append(new Date()).append("-------------------------------------\n");
            HandlerMethod h = (HandlerMethod) handler;
            int num = h.getBean().getClass().getSimpleName().indexOf("$");
            String controllerName = h.getBean().getClass().getSimpleName();
            if (num != -1) {
                controllerName = h.getBean().getClass().getSimpleName().substring(0, num);
            }
            // Controller 的包名
            sb.append("Controller      : ").append(h.getBean().getClass().getName()).append(".(").append(controllerName).append(".java:1)").append("\n");
            // 方法名称
            sb.append("Method          : ").append(h.getMethod().getName()).append("\n");
            // 请求方式 post\put\get 等等
            sb.append("RequestMethod   : ").append(request.getMethod()).append("\n");
            // 所有的请求参数
            sb.append("Params          : ").append(parmeter).append("\n");
            // 部分请求链接
            sb.append("URI             : ").append(request.getRequestURI()).append("\n");
            // 完整的请求链接
            sb.append("AllURI          : ").append(reqURL).append("\n");
            // 请求方的 ip地址
            sb.append("request IP      : ").append(ip).append("\n");
            logger.info(sb.toString());
            if (h.getMethod().getName().equals("errorHtml") || h.getMethod().getName().equals("error")) {
                return false;
            }
            //登录和注销不需要校验账户是否有效
            if (h.getMethod().getName() != "login" && h.getMethod().getName() != "logout" && h.getMethod().getName() != "test") {
                //账户有效验证
//				Cache cache = cacheManager.getCache(GlobalConfig.EHCAHE_USER);
//				String loginChar = CookieUtil.getValue(request, id);
//				if(StringUtils.isEmpty(loginChar)){
//					throw new CommonException(CommonException.NO_LOGIN);
//				}
//				
//				ValueWrapper newChar = cache.get(id);
//				if(newChar == null){
//					throw new CommonException(CommonException.LONG_TIME_NO_OPER);
//				}
//				if(!loginChar.equals(newChar.get().toString())){
//					throw new CommonException(CommonException.OTHER_PLACES_LOGIN);
//				}
            }
        }
        return true;
    }

    // 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {
    }

    // 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }

}