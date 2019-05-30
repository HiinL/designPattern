package com.six.demo.抽象工厂模式Demp;

import com.six.demo.抽象工厂模式Demp.factory.FemaleHumanFactory;
import com.six.demo.抽象工厂模式Demp.factory.HumanFactory;
import com.six.demo.抽象工厂模式Demp.factory.MaleHumanFactory;
import com.six.demo.抽象工厂模式Demp.human.Human;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 15:50
 * @Description:
 * @Version 1.8
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();
        //生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("\n---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        /*
         * ......
         * 后面继续创建
         */
    }

}
