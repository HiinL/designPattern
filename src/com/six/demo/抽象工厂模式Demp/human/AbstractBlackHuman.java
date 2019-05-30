package com.six.demo.抽象工厂模式Demp.human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:41
 * @Description:
 * @Version 1.8
 */
public abstract  class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("说黑话");
    }
}
