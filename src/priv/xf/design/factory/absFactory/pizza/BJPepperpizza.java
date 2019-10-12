package priv.xf.design.factory.absFactory.pizza;

public class BJPepperpizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨正在准备原材料");
    }

}
