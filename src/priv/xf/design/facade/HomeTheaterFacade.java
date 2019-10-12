package priv.xf.design.facade;

public class HomeTheaterFacade {

    //定义各个子系统对象
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    //构造器
    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstanc();
        this.popcorn = Popcorn.getInstanc();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //影院操作4步走

    //准备工作
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down(); //下降屏幕
        projector.on(); //投影仪开启
        stereo.on();//立体声开启
        dvdPlayer.on();//DVD机开启
        theaterLight.on();//剧院灯开启
        theaterLight.dim();//灯光调暗
    }

    //播放
    public void play(){
        dvdPlayer.play(); //DVD机播放
    }

    //暂停
    public void pause() {
        dvdPlayer.pause(); //DVD机暂停
    }

    //结束
    public void end() {
        popcorn.off();
        theaterLight.bright(); //剧院灯调亮
        screen.up(); //屏幕上升
        projector.off();//投影机关闭
        stereo.off();//立体声关闭
        dvdPlayer.off();//DVD机关闭
    }
}
