package com.practice.personal.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.practice.personal.modules.sys.dao.SysRolePermissionDao;
import com.practice.personal.modules.sys.entity.SysRolePermission;
import com.practice.personal.modules.sys.service.SysRolePermissionService;
import org.springframework.stereotype.Service;

@Service("sysRolePermissionService")
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionDao,SysRolePermission> implements SysRolePermissionService {
}
