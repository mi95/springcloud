package com.user.utils;

import com.common.utils.CommonValues;
import com.user.model.RoleInfo;
import com.user.model.UserInfo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetialUtils extends UserInfo implements UserDetails {
    private List<RoleInfo> roleInfos;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        List<RoleInfo> roles = this.getRoleInfos();
        for (RoleInfo role : roles) {
            auths.add(new SimpleGrantedAuthority(role.getName()));
        }
        return auths;
    }

    /**
     * 返回验证用户密码,无则返回NULL
     * @return
     */
    @Override
    public String getPassword() {
        return this.getPwd();
    }

    /**
     * 返回验证用户名,无则返回NULL
     * @return
     */
    @Override
    public String getUsername() {
        return this.getUserName();
    }

    //账户是否过期,过期无法验证
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //指定用户是否被锁定或者解锁,锁定的用户无法进行身份验证
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //指示是否已过期的用户的凭据(密码),过期的凭据防止认证
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //是否被禁用,禁用的用户不能身份验证
    @Override
    public boolean isEnabled() {
        return this.getState() == CommonValues.STATE_ABLE ? true : false;
    }

    public List<RoleInfo> getRoleInfos() {
        return roleInfos;
    }

    public void setRoleInfos(List<RoleInfo> roleInfos) {
        this.roleInfos = roleInfos;
    }
}
