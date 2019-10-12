package priv.xf.design.factory.SimpleFactory.pizza;

public abstract class Pizza {

    protected String name; //pizza的名称

    //准备原材料，不同的pizza材料不一样，因此该方法设计为抽象方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
