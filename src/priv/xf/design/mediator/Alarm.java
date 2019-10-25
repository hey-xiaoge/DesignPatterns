package priv.xf.design.mediator;

/**
 * 闹钟类
 */
public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象是，将自己放入到ConcreteMediator 对象中
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange) {
        sendMessages(stateChange);
    }

    @Override
    public void sendMessages(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);

    }


}
