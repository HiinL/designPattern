package com.six.demo.建造者模式Demo;

import com.six.demo.建造者模式Demo.builder.BMWBuilder;
import com.six.demo.建造者模式Demo.builder.BenzBuilder;
import com.six.demo.建造者模式Demo.model.BMWModel;
import com.six.demo.建造者模式Demo.model.BenzModel;

import java.util.ArrayList;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/5/30 17:34
 * @Description:
 * @Version 1.8
 */
public class Client {
    public static void main(String[] args) {
        /*
         * 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); //客户要求，run时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();
        //按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
        bmw.run();

        Director director = new Director();
        //100辆A类型的奔驰车
        for(int i=0;i<100;i++){
            director.getABenzModel().run();
        }
        //50
        for(int i=0;i<50;i++){
            director.getBBenzModel().run();
        }
        //20
        for(int i=0;i<20;i++){
            director.getCBMWModel().run();
        }
    }

}
