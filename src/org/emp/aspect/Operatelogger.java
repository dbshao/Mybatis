package org.emp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by itachi on 2017/2/17.
 */
@Component
@Aspect
public class Operatelogger {

    //    前置、后置、通知都一样的
//    @Before("within(org.emp.controller.*)")
    public void log1(){
        System.out.println("--记录用户操作信息--");
    }

    //环绕通知
//    @Around("within(org.emp.controller.*)")
    public Object log2(ProceedingJoinPoint pj) throws Throwable{
        //目标组件的类名
        String className=pj.getTarget().getClass().getName();
        //调用方法名
        String method=pj.getSignature().getName();
        //当前系统时间
        String date=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
//        拼写日志信息
        String msg="-->用户在"+date+"，执行了"+className+"."+method+"()";
        System.out.println(msg);
        //执行目标主键的方法
        Object obj=pj.proceed();
        //执行目标逐渐后，还可以做一些其他业务
        System.out.println("-->调用目标组件后方法后--");
        return obj;
    }

//    异常通知
    @AfterThrowing(pointcut = "within(org.emp.controller.*)",throwing = "e")
    public void log3(Exception e){
        StackTraceElement[] elems=e.getStackTrace();
        //记录异常信息
        System.out.println("-->"+elems[0].toString());
    }
}

