package com.six.demo.工厂方法模式Demo.factory;

import com.six.demo.工厂方法模式Demo.human.BlackHuman;
import com.six.demo.工厂方法模式Demo.human.Human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:46
 * @Description:
 * @Version 1.8
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
