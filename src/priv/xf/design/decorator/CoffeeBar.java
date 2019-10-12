package priv.xf.design.decorator;

public class CoffeeBar {

    public static void main(String[] args) {

        System.out.println("===== 装饰者模式 =====");

        //装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDescription());

        //2.order加入一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶费用=" + order.cost());
        System.out.println("order加入一份牛奶描述=" + order.getDescription());

        //3.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶费用=" + order.cost());
        System.out.println("order加入一份牛奶描述=" + order.getDescription());

        //4.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶费用=" + order.cost());
        System.out.println("order加入一份牛奶描述=" + order.getDescription());

        System.out.println("===========================");

        Drink order2 = new DeCaf();

        System.out.println("order2 费用 =" + order2.cost());
        System.out.println("order2 无因咖啡 = " + order2.getDescription());

        order2 = new Milk(order2);

        System.out.println("order2 加入一份牛奶费用 =" + order2.cost());
        System.out.println("order2 加入一份牛奶描述 = " + order2.getDescription());

    }

}
