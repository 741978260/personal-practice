package com.practice.personal.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("sys_permission")
public class SysPermission {

    @TableId
    private Long id;


    private String permission;


}
