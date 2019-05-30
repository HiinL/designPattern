package com.six.demo.单例模式demo;

/**
 * @ClassName 皇帝类
 * @author: Uny
 * @Date: 2019/5/30 15:27
 * @Description:
 * @Version 1.8
 */
public class Emperor {
    private static final Emperor emperor =new Emperor(); //初始化一个皇帝

    private Emperor(){
     //私有构造类
    }

    public static Emperor getInstance(){
        //公有静态方法获取实例
        return emperor;
    }
    //皇帝发话了
    public static void say(){
        System.out.println("我就是皇帝某某某....");
    }

}
