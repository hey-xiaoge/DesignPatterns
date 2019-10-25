package priv.xf.design.observer;

/**
 *
 */
public class CurrentConditions implements Observer{

    //温度
    private float temperature;
    //气压
    private float pressure;
    //温度
    private float humidity;

    //更新 天气情，是由WeaterData 来调用，本次是由推送的方式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("*** Today mTemperature: " + temperature + " ***");
        System.out.println("*** Today mPressure: " + pressure + " ***");
        System.out.println("*** Today mHumidity: " + humidity + " ***");
    }
}