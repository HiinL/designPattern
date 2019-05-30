package com.six.demo.抽象工厂模式Demp.human;

import com.six.demo.抽象工厂模式Demp.human.AbstractBlackHuman;

/**
 * @ClassName 黑女人
 * @author: Uny
 * @Date: 2019/5/30 15:58
 * @Description:
 * @Version 1.8
 */
public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑女人");
    }
}
