package com.six.demo.抽象工厂模式Demp.human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:43
 * @Description:
 * @Version 1.8
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("说白话");
    }
}
