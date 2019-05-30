package com.six.demo.工厂方法模式Demo.factory;

import com.six.demo.工厂方法模式Demo.human.Human;
import com.six.demo.工厂方法模式Demo.human.YellowHuman;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:47
 * @Description:
 * @Version 1.8
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
