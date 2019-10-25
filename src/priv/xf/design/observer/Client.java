package priv.xf.design.observer;

public class Client {

    public static void main(String[] args) {
        System.out.println("================= 观察者模式 =================");

        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        //注册到weatherData中
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        //测试
        System.out.println("通知各个注册的观察者，查看信息");
        weatherData.setData(10,100,30.3f);

        System.out.println();

        weatherData.removeObserver(currentConditions);
        System.out.println("通知各个注册的观察者，查看信息");
        weatherData.setData(20,101,30f);

    }
}
