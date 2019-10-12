package priv.xf.design.factory.methodFactory.order;


import priv.xf.design.factory.methodFactory.pizza.LDCheesepizza;
import priv.xf.design.factory.methodFactory.pizza.LDPepperpizza;
import priv.xf.design.factory.methodFactory.pizza.Pizza;

public class LDPizzaOrder extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("c")||orderType.equals("cheess")) {
            pizza = new LDCheesepizza();
        } else if (orderType.equals("p")||orderType.equals("pepper")) {
            pizza = new LDPepperpizza();
        }
        return pizza;
    }
}
