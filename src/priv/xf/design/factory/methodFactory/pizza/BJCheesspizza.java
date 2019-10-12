package priv.xf.design.factory.methodFactory.pizza;

public class BJCheesspizza extends Pizza{

    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨正在准备原材料");
    }

}
