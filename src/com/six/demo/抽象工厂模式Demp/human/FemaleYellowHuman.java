package com.six.demo.抽象工厂模式Demp.human;

import com.six.demo.抽象工厂模式Demp.human.AbstractYellowHuman;

/**
 * @ClassName 黄女人
 * @author: Uny
 * @Date: 2019/5/30 16:00
 * @Description:
 * @Version 1.8
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄女人");
    }
}
