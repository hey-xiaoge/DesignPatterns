package priv.xf.design.factory.absFactory.order;


public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//使用北京工厂
		new OrderPizza(new BJFactory());

		//使用伦敦工厂
//		new OrderPizza(new LDFactory());
	}

}
