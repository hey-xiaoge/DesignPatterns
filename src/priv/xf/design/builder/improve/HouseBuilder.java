package priv.xf.design.builder.improve;

/**
 * Builder: 抽象建造者 --- 创建一个Product对象的各个部件指定的接口/抽象类
 */
public abstract class HouseBuilder {

    //组合一个产品
    House house = new House();

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWall();

    //封顶
    public abstract void buildRoofed();

    public House build() {
        return house;
    }

}
