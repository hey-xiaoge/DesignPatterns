package priv.xf.design.factory.absFactory.order;


import priv.xf.design.factory.absFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class OrderPizza {

    //聚合抽象工厂
    AbsFactory factory;

    //构造器
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        String orderType=""; //用户输入的pizza类型
        Pizza pizza = null;
        //factory 可能是任意的子类工厂，如：北京工厂、伦敦工厂
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if(pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 披萨订购失败 ");
                break;
            }
        }while(true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 类型:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
