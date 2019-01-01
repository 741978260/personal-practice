package com.practice.personal.common.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

@Slf4j
public class AutoFillMetaObjectHandler extends MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

        Object createTime = getFieldValByName("createTime", metaObject);
        if (createTime == null) {
            setFieldValByName("createTime", new Date(), metaObject);
        }
//
        Object createUserId = getFieldValByName("createUserId", metaObject);
//        if (ShiroUtils.isLogin()) {
//            setFieldValByName("createUserId", ShiroUtils.getUserId(), metaObject);
//        }
//        setFieldValByName("createUserId", ShiroUtils.getUserId(), metaObject);
//        setFieldValByName("createTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

//        Object updateTime = getFieldValByName("updateTime", metaObject);
//        if (updateTime == null) {
//            setFieldValByName("updateTime", new Date(), metaObject);
//        }
//
//        Object updateUserId = getFieldValByName("updateUserId", metaObject);
//        if (updateUserId == null || "0".equals(updateUserId)) {
//            setFieldValByName("updateUserId", ShiroUtils.getUserId(), metaObject);
//        }

//        setFieldValByName("updateTime", new Date(), metaObject);
//        if(ShiroUtils.isLogin()){
//            setFieldValByName("updateUserId", ShiroUtils.getUserId(), metaObject);
//        }
    }
}
