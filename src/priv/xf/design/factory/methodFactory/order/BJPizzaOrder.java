package priv.xf.design.factory.methodFactory.order;

import priv.xf.design.factory.methodFactory.pizza.BJCheesspizza;
import priv.xf.design.factory.methodFactory.pizza.BJPepperpizza;
import priv.xf.design.factory.methodFactory.pizza.Pizza;

public class BJPizzaOrder extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("c")||orderType.equals("cheess")) {
            pizza = new BJCheesspizza();
        } else if (orderType.equals("p")||orderType.equals("pepper")) {
            pizza = new BJPepperpizza();
        }
        return pizza;
    }
}
