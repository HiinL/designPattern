package com.six.demo.工厂方法模式Demo.human;

import com.six.demo.工厂方法模式Demo.human.Human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:43
 * @Description:
 * @Version 1.8
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("说白话");
    }
}
