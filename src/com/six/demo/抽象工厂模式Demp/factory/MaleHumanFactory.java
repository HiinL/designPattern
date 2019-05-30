package com.six.demo.抽象工厂模式Demp.factory;

import com.six.demo.抽象工厂模式Demp.human.Human;
import com.six.demo.抽象工厂模式Demp.human.MaleBlackHuman;
import com.six.demo.抽象工厂模式Demp.human.MaleWhiteHuman;
import com.six.demo.抽象工厂模式Demp.human.MaleYellowHuman;

/**
 * @ClassName 男工厂
 * @author: Uny
 * @Date: 2019/5/30 16:08
 * @Description:
 * @Version 1.8
 */
public class MaleHumanFactory implements HumanFactory{
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
