package com.six.demo.抽象工厂模式Demp.factory;

import com.six.demo.抽象工厂模式Demp.human.Human;

/**
 * @ClassName 人类工厂
 * @author: Uny
 * @Date: 2019/5/30 15:45
 * @Description:
 * @Version 1.8
 */
public interface HumanFactory {
    Human createBlackHuman();

    Human createWhiteHuman();

    Human createYellowHuman();
}
