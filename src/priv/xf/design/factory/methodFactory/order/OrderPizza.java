package priv.xf.design.factory.methodFactory.order;

import priv.xf.design.factory.methodFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType=""; //用户输入的pizza类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);
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
