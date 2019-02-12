package com.practice.personal.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@TableName("sys_user")
//@EqualsAndHashCode(callSuper = true)
public class SysUser {
    private static final long serialVersionUID = 1L;

    @TableId
    private Long userId;

    /**
     * 用户名
     */
//    @NotBlank(message = "用户名不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String username;

    /**
     * 密码
     */
//    @NotBlank(message = "密码不能为空", groups = AddGroup.class)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @TableField(exist = false)
    private List<SysRole> roles;

}
