package com.six.demo.代理模式Demo;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/31 10:13
 * @Description:
 * @Version 1.8
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    //进游戏之前你肯定要登录吧，这是一个必要条件
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }

}
