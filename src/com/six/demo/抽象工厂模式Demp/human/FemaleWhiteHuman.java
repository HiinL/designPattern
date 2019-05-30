package com.six.demo.抽象工厂模式Demp.human;

import com.six.demo.抽象工厂模式Demp.human.AbstractWhiteHuman;

/**
 * @ClassName 白女人
 * @author: Uny
 * @Date: 2019/5/30 15:59
 * @Description:
 * @Version 1.8
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白女人");
    }
}
