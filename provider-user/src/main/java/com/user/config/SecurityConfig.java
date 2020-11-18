//package com.user.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.user.filter.LoginFilter;
//import com.user.service.UserService;
//import com.user.utils.UserDetialUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.*;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.ui.ModelMap;
//
//import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    UserService userService;
//    @Autowired
//    CustomFilterInvocationSecurityMetadataSource customFilterInvocationSecurityMetadataSource;
//    @Autowired
//    CustomUrlDecisionManager customUrlDecisionManager;
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        System.out.println("configure auth...");
//        auth.userDetailsService(userService);
//    }
//
//    @Override
//    public void configure(WebSecurity web) {
//        System.out.println("configure web...");
//        web.ignoring().antMatchers("/css/**","/js/**","/index.html","/img/**","/fonts/**","/favicon.ico","/verifyCode","/login");
//    }
//
//    @Bean
//    LoginFilter loginFilter() throws Exception {
//        System.out.println("loginFilter...");
//        LoginFilter loginFilter = new LoginFilter();
//        loginFilter.setAuthenticationSuccessHandler((request, response, authentication) -> {
//            response.setContentType("application/json;charset=utf-8");
//            PrintWriter out = response.getWriter();
//            UserDetialUtils userDetialUtils = (UserDetialUtils) authentication.getPrincipal();
//            userDetialUtils.setPwd(null);
//            ModelMap modelMap = new ModelMap();
//            modelMap.put("result", 1);
//            String s = new ObjectMapper().writeValueAsString(modelMap);
//            out.write(s);
//            out.flush();
//            out.close();
//        });
//        loginFilter.setAuthenticationFailureHandler((request, response, exception) -> {
//            response.setContentType("application/json;charset=utf-8");
//            PrintWriter out = response.getWriter();
//            Map map = new HashMap();
//            map.put("result","0");
//            if (exception instanceof LockedException) {
//                map.put("msg","账户被锁定，请联系管理员!");
//            } else if (exception instanceof CredentialsExpiredException) {
//                map.put("msg","密码过期，请联系管理员!");
//            } else if (exception instanceof AccountExpiredException) {
//                map.put("msg","账户过期，请联系管理员!");
//            } else if (exception instanceof DisabledException) {
//                map.put("msg","账户被禁用，请联系管理员!");
//            } else if (exception instanceof BadCredentialsException) {
//                map.put("msg","用户名或者密码输入错误，请重新输入!");
//            }
//            out.write(new ObjectMapper().writeValueAsString(map));
//            out.flush();
//            out.close();
//        });
//        loginFilter.setAuthenticationManager(authenticationManagerBean());
//        loginFilter.setFilterProcessesUrl("/doLogin");
//        return loginFilter;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        System.out.println("configure http...");
//        http.authorizeRequests()
////                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
////                    @Override
////                    public <O extends FilterSecurityInterceptor> O postProcess(O object) {
////                        object.setAccessDecisionManager(customUrlDecisionManager);
////                        object.setSecurityMetadataSource(customFilterInvocationSecurityMetadataSource);
////                        return object;
////                    }
////                })
//                .and()
//                .logout()
//                .logoutSuccessHandler((req, resp, authentication) -> {
//                    resp.setContentType("application/json;charset=utf-8");
//                    PrintWriter out = resp.getWriter();
////                    out.write(new ObjectMapper().writeValueAsString(RespBean.ok("注销成功!")));
//                    out.flush();
//                    out.close();
//                })
//                .permitAll()
//                .and()
//                .csrf().disable().exceptionHandling()
//                //没有认证时，在这里处理结果，不要重定向
//                .authenticationEntryPoint((req, resp, authException) -> {
//                    resp.setContentType("application/json;charset=utf-8");
//                    resp.setStatus(401);
//                    PrintWriter out = resp.getWriter();
//                    Map map = new HashMap();
//                    map.put("result",0);
//                    if (authException instanceof InsufficientAuthenticationException) {
//                        map.put("msg","请求失败，请联系管理员!");
//                    }
//                    out.write(new ObjectMapper().writeValueAsString(map));
//                    out.flush();
//                    out.close();
//                });
//        http.addFilterAt(loginFilter(), UsernamePasswordAuthenticationFilter.class);
//    }
//}