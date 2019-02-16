package com.practice.personal.common.aspect;

import com.practice.personal.common.annotation.SysLog;
import com.practice.personal.modules.sys.entity.SysLogEntity;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 系统日志，切面处理类
 */
@Aspect
@Component
@Slf4j
public class SysLogAspect {

    @Pointcut("@annotation(com.practice.personal.common.annotation.SysLog)")
    public void logPointCut() {

    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;

        //保存日志
        saveLog(point,time);

        return result;
    }

    private void saveLog(ProceedingJoinPoint point, long time) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        SysLogEntity sysLog = new SysLogEntity();
        SysLog syslog = method.getAnnotation(SysLog.class);
        if(syslog != null){
            //注解上的描述
            sysLog.setOperation(syslog.value());
        }

        //请求的方法名
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLog.setMethod(className + "." + methodName + "()");

        //请求的参数
        Object[] args = point.getArgs();
        try {
//            String params = new Gson().toJson(args[0]);
//            sysLog.setParams(params);
        } catch (Exception e) {
            log.error("GSON转换错误", e);
        }

        //获取request
//        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        //设置IP地址
//        sysLog.setIp(IPUtils.getIpAddr(request));





    }


}
