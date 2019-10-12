package priv.xf.design.factory.absFactory.order;

import priv.xf.design.factory.absFactory.pizza.BJCheesspizza;
import priv.xf.design.factory.absFactory.pizza.BJPepperpizza;
import priv.xf.design.factory.absFactory.pizza.Pizza;

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("----- 抽象工厂模式 -----");
        Pizza pizza = null;
        if (orderType.equals("c")||orderType.equals("cheess")) {
            pizza = new BJCheesspizza();
        } else if (orderType.equals("p")||orderType.equals("pepper")) {
            pizza = new BJPepperpizza();
        }
        return pizza;
    }
}
