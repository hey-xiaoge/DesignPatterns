package priv.xf.design.singleton.type05;

/**
 * 单利模式
 * 懒汉式（双重检验）
 */
public class SingletonTest {

    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式（线程安全，同步方法）"); //true
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashCode()== " + instance.hashCode()); //true
        System.out.println("instance2.hashCode()== " + instance.hashCode()); //true
    }
}

class Singleton {
    //1.类内部创建对象实例
    private static volatile Singleton instance;

    //2.私有化构造方法
    private Singleton() { }

    //3.提供一个静态的公有方法，加入双重检查代码，解决线程安全问题和效率问题
    public static  Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}