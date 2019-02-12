package com.practice.personal.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.practice.personal.modules.sys.entity.SysUser;

import java.util.List;

public interface SysUserDao extends BaseMapper<SysUser> {

    List<Long> queryUserPermissions(Long userId);
}
