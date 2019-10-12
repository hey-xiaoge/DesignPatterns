package priv.xf.design.builder;

public class Client {

    public static void main(String[] args) {
        System.out.println("----- 建造者模式（传统方式） -----");
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
