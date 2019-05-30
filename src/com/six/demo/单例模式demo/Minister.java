package com.six.demo.单例模式demo;

/**
 * @ClassName 巨子类
 * @author: Uny
 * @Date: 2019/5/30 15:29
 * @Description:
 * @Version 1.8
 */
public class Minister {
    public static void main(String[] args) {
        for(int day=0;day<3;day++){
            Emperor emperor=Emperor.getInstance();
            emperor.say();
        }
        //三天见的皇帝都是同一个人，荣幸吧！
    }

}
