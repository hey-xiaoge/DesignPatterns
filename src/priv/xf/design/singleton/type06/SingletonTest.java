package priv.xf.design.singleton.type06;

/**
 * 单例模式
 * 静态内部类（线程安全，效率高）
 */
public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("静态内部类"); //true
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashCode()== " + instance.hashCode()); //true
        System.out.println("instance2.hashCode()== " + instance.hashCode()); //true
    }
}

class Singleton{

    //1.构建一个静态内部类
    private  static class  SingletonInsctance{
        private static final Singleton INSCTANCE = new Singleton();
    }

    //2.私有化构造方法
    private Singleton() { }


    public static Singleton getInstance() {
        return SingletonInsctance.INSCTANCE;
    }

}