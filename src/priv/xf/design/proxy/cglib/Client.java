package priv.xf.design.proxy.cglib;

public class Client {

    public static void main(String[] args) {
        System.out.println("===== 代理模式之 Cglib代理模式 =====");
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取代理对象，并且将目标对象传递get代理对象
        TeacherDao proxyInstace = (TeacherDao) new PoxyFactory(target).getProxyInstance();
        //执行代理对象的方法，触发intecept方法，从而实现对目标对象的调用
        proxyInstace.teach();
    }

}
