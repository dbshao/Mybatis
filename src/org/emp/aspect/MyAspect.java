package org.emp.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by itachi on 2017/2/16.
 */
public class MyAspect {
    /*
    前置通知：方法运行之前增强
    常用于权限控制没日志记录
    参数 org.aspectj.lang.JoimPoint
    连接点对象（方法的包装对象：方法，参数，目标对象）
    方法名字可以随便写，但配置时要一样
     */

    public void before(JoinPoint joinPoint){
        String loginName = "admin";
        System.out.println("方法名称:"+joinPoint.getSignature().getName());
        System.out.println("目标对象:"+joinPoint.getTarget().getClass().getName());
        System.out.println("代理对象:"+joinPoint.getThis().getClass().getName());
        //判断用户有没有执行方法的权限
        if(joinPoint.getSignature().getName().equals("find")){
            if(!loginName.equals("admin")){
                throw new RuntimeException("您没有权限执行方法:"+joinPoint.getSignature().getName()
                        +",类型为:"+joinPoint.getTarget().getClass().getName());
            }
        }
    }

    /*
    后置通知，在目标方法后运行，返回值后执行通知增强代码逻辑
    参数1：连接点对象
    参数2：目标方法的返回值
     */
    public void afterReturning(JoinPoint joinPoint,Object returnVal){
//        下发短息：调用运营商的接口，短信猫
        System.out.println("--后置通知--当前下发短信的方法：尊敬的用户，" +
                "你调用的方法返回余额为"+returnVal);
        //同时可以在下发短信后，记录日志
        System.out.println("--日志记录，操作的额类型为"+joinPoint.getTarget().getClass().getName()+
        "操作的方法："+joinPoint.getSignature().getName());
    }

    /*
    环绕通知：目标方法执行前后都进行增强
    应用场景：日志，事务管理
    接收参数：ProceedingJoinpoint 可执行的链接点，特点，可以调用proceed方法
    可以随时随地的执行目标对象的方法，相当于目标对象的方法被执行了
    必须跑出Throwable异常
     */
    public Object around(ProceedingJoinPoint pj) throws Throwable{
        System.out.println("---事物开启了---");
        Object resultObject=pj.proceed();
        System.out.println("返回结果："+resultObject);
        System.out.println("---事务提交成功---");
        return resultObject;//目标方法执行返回的结果
    }

    /*
    抛出通知，目标代码出现异常，执行通知
    一般处理异常
     */
    public void afterThrowing(JoinPoint jp,Throwable ex){
        System.out.println("++管理员利好"+jp.getTarget().getClass().getName()+
        "的方法："+jp.getSignature().getName()+"发生了异常，异常为+"+ex.getMessage());

    }

    /*
 * 最终通知
 * 无论目标方法是否发生异常，最终通知都会执行，相当于finally
 * 应用场景：释放资源
 */
    public void after(JoinPoint jp){
        //释放数据库连接
        System.out.println("数据库的connection被释放了，执行的方法是："+
                jp.getSignature().getName());
    }
}
