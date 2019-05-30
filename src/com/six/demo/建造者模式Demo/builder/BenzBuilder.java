package com.six.demo.建造者模式Demo.builder;

import com.six.demo.建造者模式Demo.model.BenzModel;
import com.six.demo.建造者模式Demo.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:40
 * @Description:
 * @Version 1.8
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
