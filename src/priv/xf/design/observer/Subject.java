package priv.xf.design.observer;

//接口， 让WeatherData 来实现
public interface Subject {

    //注册
    public void registerObserver(Observer o);

    //删除
    public void removeObserver(Observer o);

    //通知
    public void notifyObserver();

}
