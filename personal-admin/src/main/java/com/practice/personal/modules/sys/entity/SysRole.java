package com.practice.personal.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

@Data
@ToString
@TableName("sys_role")
public class SysRole {

    /**
     * 角色ID
     */
    @TableId
    private Long roleId;

    /**
     * 角色名称
     */
//    @NotBlank(message = "角色名称不能为空")
    private String roleName;

    private List<SysPermission> permissionList;


}
