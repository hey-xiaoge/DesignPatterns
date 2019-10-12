package priv.xf.design.facade;


/**
 * DVD播放机
 * 单例模式 —— 饿汉式
 */
public class DVDPlayer {

    //私有化静态变量
    private static DVDPlayer instance = new DVDPlayer();

    //构造器私有化
    private DVDPlayer() {

    }

    /**
     *  对外提供获取单利的方法
     */
    public static DVDPlayer getInstanc() {
        return instance;
    }

    //开机
    public void on() {
        System.out.println(" dvd on ");
    }
    //关机
    public void off() {
        System.out.println(" dvd off ");
    }

    //播放
    public void play() {
        System.out.println(" dvd is playing ");
    }

    //暂停
    public void pause() {
        System.out.println(" dvd pause ..");
    }

}
