package com.six.demo.抽象工厂模式Demp.factory;

import com.six.demo.抽象工厂模式Demp.human.FemaleBlackHuman;
import com.six.demo.抽象工厂模式Demp.human.FemaleWhiteHuman;
import com.six.demo.抽象工厂模式Demp.human.FemaleYellowHuman;
import com.six.demo.抽象工厂模式Demp.human.Human;

/**
 * @ClassName 女工厂
 * @author: Uny
 * @Date: 2019/5/30 16:05
 * @Description:
 * @Version 1.8
 */
public class FemaleHumanFactory implements HumanFactory{
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
