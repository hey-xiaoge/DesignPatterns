package priv.xf.design.factory.methodFactory.pizza;

public class LDCheesepizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨正在准备原材料");
    }

}
