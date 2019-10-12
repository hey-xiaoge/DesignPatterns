package priv.xf.design.singleton.type01;

/**
 * 单例模式
 * 饿汉式（静态常量）
 */

public class SingletonTest {

    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashCode()== " + instance.hashCode()); //true
        System.out.println("instance2.hashCode()== " + instance.hashCode()); //true
    }
}

class Singleton {
    //1.私有化构造方法
    private Singleton() {
    }

    //2.类内部创建对象实例
    private static Singleton instance = new Singleton();

    //3.提供一个公有的静态方法,返回一个实例对象
    public static Singleton getInstance() {
        return instance;
    }

}
