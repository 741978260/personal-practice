package com.practice.personal.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.practice.personal.modules.sys.dao.SysUserRoleDao;
import com.practice.personal.modules.sys.entity.SysUserRole;
import com.practice.personal.modules.sys.service.SysUserRoleService;
import org.springframework.stereotype.Service;

@Service("sysUserRoleService")
public class SysUserRoleServicImpl extends ServiceImpl<SysUserRoleDao,SysUserRole> implements SysUserRoleService {
}
