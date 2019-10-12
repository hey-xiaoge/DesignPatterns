package priv.xf.design.builder.improve;

public class Client {

    public static void main(String[] args) {

        System.out.println("----- 建造者模式 -----");

        //盖普通房子
        CommonBuilding commonBuilding = new CommonBuilding();

        //准备创建房子的指挥者
        HouserDirector houserDirector = new HouserDirector(commonBuilding);

        //完成盖房子，返回产品(普通房子)
        House house = houserDirector.constructHouse();

        System.out.println("完成的产品"+house);
    }
}
