package priv.xf.design.factory.absFactory.order;

import priv.xf.design.factory.absFactory.pizza.*;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("----- 抽象工厂模式 -----");
        Pizza pizza = null;
        if (orderType.equals("c")||orderType.equals("cheess")) {
            pizza = new LDCheesepizza();
        } else if (orderType.equals("p")||orderType.equals("pepper")) {
            pizza = new LDPepperpizza();
        }
        return pizza;
    }
}
