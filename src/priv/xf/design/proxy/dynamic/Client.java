package priv.xf.design.proxy.dynamic;


public class Client {

    public static void main(String[] args) {
        System.out.println("===== 代理模式 之 动态代理 =====");

        //创建目标对象
        ITeacherDao traget = new TeacherDao();

        //创建代理对象，可以转成ITeacherDao
        ITeacherDao proxy = (ITeacherDao) new ProxyFactory(traget).getProxyInstance();

        //proxy= class com.sun.proxy.$Proxy0  $符号表示内存中动态生成了代理对象
        System.out.println("proxy= " + proxy.getClass());


        //通过代理对象，调用到被代理对象的方法
        proxy.teach();
        proxy.rollcall("Jack");

    }
}
