package priv.xf.design.factory.absFactory.pizza;

public class LDPepperpizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨正在准备原材料");
    }

}
