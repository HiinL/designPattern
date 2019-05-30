package com.six.demo.工厂方法模式Demo.human;

import com.six.demo.工厂方法模式Demo.human.Human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:41
 * @Description:
 * @Version 1.8
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("说黑话");
    }
}
