package com.practice.personal.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.practice.personal.modules.sys.dao.SysRoleDao;
import com.practice.personal.modules.sys.entity.SysRole;
import com.practice.personal.modules.sys.service.SysRoleService;
import org.springframework.stereotype.Service;

@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao,SysRole> implements SysRoleService {
}
