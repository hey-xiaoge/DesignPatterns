package priv.xf.design.singleton.type03;

/**
 * 单例模式
 * 懒汉式（线程不安全）
 */
public class SingletonTest {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式（线程不安全）"); //true
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton{
    //1.类内部创建对象实例
    private static Singleton instance;

    //2.私有化构造方法
    private Singleton() { }

    //3.提供一个静态的公有方法，加入同步处理，解决线程安全问题，但效率低
    public static  Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
