package com.user.config;

import com.common.utils.CommonException;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 当前登录用户的角色与当前访问url需要的角色比对
 */
@Component
public class CustomUrlDecisionManager implements AccessDecisionManager {
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) {
        for (ConfigAttribute configAttribute : configAttributes) {
            String needRole = configAttribute.getAttribute();
//            if ("ROLE_LOGIN".equals(needRole)) {
//                if (authentication instanceof AnonymousAuthenticationToken) {
//                    CommonException.throwNewCommonException(CommonException.NO_LOGIN);
//                }else {
//                    return;
//                }
//            }
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            for (GrantedAuthority authority : authorities) {
                if (authority.getAuthority().equals(needRole)) {
                    return;
                }
            }
        }
//        String requestUrl = ((FilterInvocation) object).getRequestUrl();
//        Db.findFirst("select 1 from role_user_info roleUser\n" +
//                "\tjoin role_auth_info roleAuth\n" +
//                "\tJOIN auth_info auths on roleAuth.auth_id = auths.id\n" +
//                "\twhere auths.path = ? and roleUser.user_id = 3",requestUrl);
        CommonException.throwNewCommonException("权限不足");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
