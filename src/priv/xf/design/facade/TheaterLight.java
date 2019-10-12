package priv.xf.design.facade;

/**
 * 剧院灯
 * 单例模式 —— 饿汉式
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    private TheaterLight() {
    }

    public static TheaterLight getInstance() {
        return instance;
    }

    //开机
    public void on() {
        System.out.println(" TheaterLight on ");
    }

    //关机
    public void off() {
        System.out.println(" TheaterLight off ");
    }

    //减低亮度
    public void dim() {
        System.out.println(" TheaterLight dim.. ");
    }

    //增加亮度
    public void bright() {
        System.out.println(" TheaterLight bright.. ");
    }
}
