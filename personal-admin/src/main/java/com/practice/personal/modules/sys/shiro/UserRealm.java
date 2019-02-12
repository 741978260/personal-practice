package com.practice.personal.modules.sys.shiro;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.practice.personal.modules.sys.entity.SysUser;
import com.practice.personal.modules.sys.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * 自定义权限匹配和账号密码匹配
 */
@Component
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUser sysUser = (SysUser) principals.getPrimaryPrincipal();
        Set<String> strings = sysUserService.queryPermissions(sysUser.getUserId());
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions(strings);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        SysUser sysUser = sysUserService.selectOne(new EntityWrapper<SysUser>().eq("username", username));
        return new SimpleAuthenticationInfo(sysUser,sysUser.getPassword(),getName());
    }
}
