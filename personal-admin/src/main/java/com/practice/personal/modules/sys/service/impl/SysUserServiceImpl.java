package com.practice.personal.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.practice.personal.modules.sys.dao.SysUserDao;
import com.practice.personal.modules.sys.entity.SysPermission;
import com.practice.personal.modules.sys.entity.SysUser;
import com.practice.personal.modules.sys.service.SysPermissionService;
import com.practice.personal.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao,SysUser> implements SysUserService {

    @Autowired
    private SysPermissionService sysPermissionService;

    @Override
    public Set<String> queryPermissions(Long userId) {
        List<SysPermission> sysPermissions = this.queryUserPermissions(userId);
        Set <String> permsSet = new HashSet<String>();
        for(SysPermission sysPermission : sysPermissions){
            permsSet.add(sysPermission.getPermission());
        }
        return permsSet;
    }

    @Override
    public List<SysPermission> queryUserPermissions(Long userId) {
        List<Long> longs = baseMapper.queryUserPermissions(userId);
        List<SysPermission> list = new ArrayList<>();
        for(Long permissionId : longs){
            SysPermission sysPermission = sysPermissionService.selectById(permissionId);
            list.add(sysPermission);
        }
        return list;
    }
}
