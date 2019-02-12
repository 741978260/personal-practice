package com.practice.personal.common.utils;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


/**
 * 部门管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-06-20 15:23:47
 */
@Data
@ToString
public class SysBaseEntity implements Serializable {

    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    //创建人ID
//    @JsonSerialize(using = UserSerializer.class)
    @TableField(value = "create_user_id", fill = FieldFill.INSERT)
    private Long createUserId;

    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

    //更新人ID
//    @JsonSerialize(using = UserSerializer.class)
    @TableField(value = "update_user_id", fill = FieldFill.UPDATE)
    private Long updateUserId;

}
