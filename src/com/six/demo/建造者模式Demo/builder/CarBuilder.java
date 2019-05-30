package com.six.demo.建造者模式Demo.builder;

import com.six.demo.建造者模式Demo.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:39
 * @Description:
 * @Version 1.8
 */
public abstract class CarBuilder {
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
