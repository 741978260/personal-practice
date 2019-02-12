package com.practice.personal.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.practice.personal.modules.sys.entity.SysPermission;
import com.practice.personal.modules.sys.entity.SysUser;

import java.util.List;
import java.util.Set;

public interface SysUserService extends IService<SysUser> {
    Set<String> queryPermissions(Long userId);
    List<SysPermission> queryUserPermissions(Long userId);
}
