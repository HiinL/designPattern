package com.six.demo.建造者模式Demo;

import com.six.demo.建造者模式Demo.builder.BMWBuilder;
import com.six.demo.建造者模式Demo.builder.BenzBuilder;
import com.six.demo.建造者模式Demo.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:30
 * @Description:
 * @Version 1.8
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();


    public CarModel getABenzModel(){
        //清理场景
        this.sequence.clear();
        //ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
            //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }
    public CarModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }
    public CarModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return this.bmwBuilder.getCarModel();
    }
    public CarModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }
}
