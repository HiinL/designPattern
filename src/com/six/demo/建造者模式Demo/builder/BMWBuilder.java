package com.six.demo.建造者模式Demo.builder;

import com.six.demo.建造者模式Demo.model.BMWModel;
import com.six.demo.建造者模式Demo.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:41
 * @Description:
 * @Version 1.8
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
