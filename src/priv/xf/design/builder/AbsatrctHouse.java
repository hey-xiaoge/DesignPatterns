package priv.xf.design.builder;

/**
 * 建造者模式
 * <p>
 * 需要建房子：这一过程为打桩、砌墙、封顶
 * 房子有各种各样的，比如普通房，高楼，别墅，各种房子的过程虽然一样，但是要求不要相同的.
 * <p>
 * 传统方法
 */
public abstract class AbsatrctHouse {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
