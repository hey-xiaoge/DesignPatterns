package priv.xf.design.builder.improve;

/**
 * ConcreteBuilder:具体建造者 --- 实现接口，构建和装配各个部件
 */
public class CommonBuilding extends HouseBuilder{

    @Override
    public void buildBasic() {
        house.setBasic("5米深地基");
        System.out.println("普通房子打基地");
    }

    @Override
    public void buildWall() {
        house.setWall("墙壁厚度10cm");
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("没有屋顶");
        System.out.println("普通房子封顶");
    }
}
