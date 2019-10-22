package priv.xf.design.template;

public class Client {

    public static void main(String[] args) {
        System.out.println("===== 模板模式 =====");

        System.out.println("制作红豆豆浆");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("------------------------------------------");

        System.out.println("制作花生豆浆");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        redBeanSoyaMilk.make();

    }
}
