package priv.xf.design.singleton.type07;

/**
 * 枚举
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("枚举"); //true
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashCode()== " + instance.hashCode()); //true
        System.out.println("instance2.hashCode()== " + instance.hashCode()); //true
    }
}

enum Singleton{
    INSTANCE;

    public void isOK() {
        System.out.println("isOk");
    }
}


