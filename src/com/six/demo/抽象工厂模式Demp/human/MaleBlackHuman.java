package com.six.demo.抽象工厂模式Demp.human;

import com.six.demo.抽象工厂模式Demp.human.AbstractBlackHuman;

/**
 * @ClassName 黑男人
 * @author: Uny
 * @Date: 2019/5/30 16:01
 * @Description:
 * @Version 1.8
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑男人");
    }
}
