package priv.xf.design.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator {

    //集合，放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<String, Colleague>();
        this.interMap = new HashMap<String, String>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1.根据得到消息，完成对应任务
     * 2.中介者在这个方法，协调各个具体的同事对象，完成任务
     *
     * @param stateChange
     * @param colleague
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) { //处理闹钟发出的消息
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains"))))
                    .upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {//如果是TV的消息

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            ////如果是Curtains的消息
        }
    }

    @Override
    public void sendMessage(String colleagueName, Colleague colleague) {

    }
}
