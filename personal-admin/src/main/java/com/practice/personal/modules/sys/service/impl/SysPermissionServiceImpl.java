package com.practice.personal.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.practice.personal.modules.sys.dao.SysPermissionDao;
import com.practice.personal.modules.sys.entity.SysPermission;
import com.practice.personal.modules.sys.service.SysPermissionService;
import org.springframework.stereotype.Service;

@Service("sysPermissionService")
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionDao,SysPermission> implements SysPermissionService {
}
