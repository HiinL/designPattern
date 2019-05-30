package com.six.demo.工厂方法模式Demo.factory;

import com.six.demo.工厂方法模式Demo.human.Human;
import com.six.demo.工厂方法模式Demo.human.WhiteHuman;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:48
 * @Description:
 * @Version 1.8
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
