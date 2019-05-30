package com.six.demo.工厂方法模式Demo.factory;

import com.six.demo.工厂方法模式Demo.human.Human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:45
 * @Description:
 * @Version 1.8
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();
}
