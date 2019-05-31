package com.six.demo.代理模式Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/31 10:27
 * @Description:
 * @Version 1.8
 */
public class Client {
    public static void main(String[] args) throws Throwable {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        /*代理操作*/
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
        //登录
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");

        /*自己操作*/
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        //登录
        player.login("zhangSan", "password");
        //开始杀怪
        player.killBoss();
        //升级
        player.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");

    }
}
