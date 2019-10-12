package priv.xf.design.facade;

public class Client {

    public static void main(String[] args) {
        System.out.println("===== 外观模式（过程模式） =====");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();

    }
}
