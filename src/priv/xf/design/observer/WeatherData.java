package priv.xf.design.observer;

import java.util.ArrayList;

/**
 * 类是核心
 * 1.包含更新天气的方法
 * 2.含有 观察者集合，使用ArrayList管理
 * 3.当数据有更新时，就主动调用 ArrayList，通知所有的（接入方）就看到最新的信息
 */
public class WeatherData implements Subject {

    //温度
    private float temperature;
    //气压
    private float pressure;
    //温度
    private float humidity;

    //观察者集合
    private ArrayList<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<Observer>();
    }

    private void dataChange() {
        //调用接入方的update
        notifyObserver();

    }

    //当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange，将最新的信息 推送给接入方
        dataChange();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

   //遍历所有的观察者，并通知
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }

    /* get、set start*/
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public ArrayList<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(ArrayList<Observer> observerList) {
        this.observerList = observerList;
    }
    /* get、set end*/
}
