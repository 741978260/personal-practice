package com.practice.personal.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.practice.personal.common.utils.SysBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 系统日志
 */
@Data
@ToString
@TableName("sys_log")
@EqualsAndHashCode(callSuper = true)
public class SysLogEntity extends SysBaseEntity {

    private static final long serialVersionUID = 1L;
    @TableId
    private Long id;
    //用户名
    private String username;
    //用户操作
    private String operation;
    //请求方法
    private String method;
    //请求参数
    private String params;
    //执行时长(毫秒)
    private Long time;
    //IP地址
    private String ip;



}
