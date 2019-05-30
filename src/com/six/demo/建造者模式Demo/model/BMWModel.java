package com.six.demo.建造者模式Demo.model;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:33
 * @Description:
 * @Version 1.8
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎是这个声音的...");
    }
}
