package com.user.config;

import com.common.utils.CommonException;
import com.user.model.RoleInfo;
import com.user.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * 根据用户传来的请求地址，获取需要的角色
 */
@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    AuthService authService;

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        List<RoleInfo> roleInfos = authService.findRoleByPath(requestUrl);
        if (CommonException.verifyListB(roleInfos)) {
            CommonException.throwNewCommonExceptionForCustom("权限不足！");
        }
        String[] str = new String[roleInfos.size()];
        int index = 0;
        for (RoleInfo roleInfo : roleInfos) {
            str[index] = roleInfo.getName();
            index += 1;
        }
        return SecurityConfig.createList(str);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
