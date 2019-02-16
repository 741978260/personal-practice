package com.practice.personal.modules.test.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("thread_index")
public class ThreadIndex {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private String name;

    private String description;


}
