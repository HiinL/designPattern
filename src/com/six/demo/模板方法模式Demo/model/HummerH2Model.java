package com.six.demo.模板方法模式Demo.model;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:09
 * @Description:
 * @Version 1.8
 */
public class HummerH2Model extends HummerModel {

    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    protected void start() {
        System.out.println("悍马H2发动...");
    }

    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    protected boolean isAlarm() {
        return false;
    }

}
