package priv.xf.design.mediator;

public class Client {

    public static void main(String[] args) {
        System.out.println("================== 中介者模式 ==================");
        //创建一个中介者
        Mediator mediator = new ConcreteMediator();
        //创建Alarm时，并且加入到concreteMediator的HashMap里
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建coffeeMachine时，并且加入到concreteMediator的HashMap里
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        //创建curtains时，并且加入到concreteMediator的HashMap里
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");
        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.sendAlarm(1);
    }
}
