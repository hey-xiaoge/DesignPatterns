package priv.xf.design.bridge;

public class Client {

    public static void main(String[] args) {
        System.out.println("===== 桥接模式 =====");
        Phone phone1 = new FlodedPhone(new HuaWei());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("--------------------");

        Phone phone2 = new TouchPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("--------------------");

        Phone phone3 = new TouchPhone(new HuaWei());
        phone3.open();
        phone3.call();
        phone3.close();
    }

}
