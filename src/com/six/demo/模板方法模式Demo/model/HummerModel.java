package com.six.demo.模板方法模式Demo.model;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:06
 * @Description:
 * @Version 1.8
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run() {
        this.start();
        this.engineBoom();
        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }
    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm(){
        return true;
    }

}
