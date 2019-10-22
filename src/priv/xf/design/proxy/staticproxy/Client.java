package priv.xf.design.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        System.out.println("===== 代理模式 之 静态代理 =====");

        //创建目标对象
        ITeacherDao traget = new TeacherDao();

        //创建代理对象
        ITeacherDao proxy = new TeacherDaoProxy(traget);

        //通过代理对象，调用到被代理对象的方法
        proxy.teach();

    }
}
