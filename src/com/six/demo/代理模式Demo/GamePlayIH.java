package com.six.demo.代理模式Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/31 10:16
 * @Description:
 * @Version 1.8
 */
public class GamePlayIH implements InvocationHandler {
    //被代理的实例
    Object obj ;
    //我要代理谁
    public GamePlayIH(Object _obj){
        this.obj = _obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        //如果是登录方法，则发送信息
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用我的账号登录！");
        }

        return result;
    }
}
