package priv.xf.design.builder.improve;

/**
 * Director: 指挥者，这里去指定制作流程，返回产品
 */
public class HouserDirector {

   private  HouseBuilder houseBuilder ;

    //构造器传入
    public HouserDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过 set 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如果处理建造房子的流程，交给指挥者
    public  House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        return houseBuilder.build();
    }
}
