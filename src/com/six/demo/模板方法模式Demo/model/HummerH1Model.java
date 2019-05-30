package com.six.demo.模板方法模式Demo.model;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:08
 * @Description:
 * @Version 1.8
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }
    protected void start() {
        System.out.println("悍马H1发动...");
    }
    protected void stop() {
        System.out.println("悍马H1停车...");
    }
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
