package priv.xf.design.factory.SimpleFactory.order;

import priv.xf.design.factory.SimpleFactory.pizza.CheesePizza;
import priv.xf.design.factory.SimpleFactory.pizza.GreekPizza;
import priv.xf.design.factory.SimpleFactory.pizza.PepperPizza;
import priv.xf.design.factory.SimpleFactory.pizza.Pizza;

//简单工厂
public class SimpleFactory {

    //普通方法
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂分配订单");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    //静态方法
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂分配订单");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }


}
