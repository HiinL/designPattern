package com.six.demo.工厂方法模式Demo;

import com.six.demo.工厂方法模式Demo.factory.BlackHumanFactory;
import com.six.demo.工厂方法模式Demo.factory.WhiteHumanFactory;
import com.six.demo.工厂方法模式Demo.factory.YellowHumanFactory;
import com.six.demo.工厂方法模式Demo.human.Human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:50
 * @Description:
 * @Version 1.8
 */
public class NvWa {
    public static void main(String[] args) {
//女娲第一次造人，火候不足，于是白色人种产生了
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
//女娲第二次造人，火候过足，于是黑色人种产生了
        System.out.println("\n--造出的第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
//第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("\n--造出的第三批人是黄色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
