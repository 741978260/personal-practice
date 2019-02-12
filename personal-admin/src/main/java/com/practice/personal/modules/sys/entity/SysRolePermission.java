package com.practice.personal.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("sys_role_permission")
public class SysRolePermission {

    @TableId
    private Long id;

    private Long userId;

    private Long roleId;

}
