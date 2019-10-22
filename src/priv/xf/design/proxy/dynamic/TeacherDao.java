package priv.xf.design.proxy.dynamic;

//被代理对象
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教师正在授课。。。");
    }

    @Override
    public void rollcall(String name) {
        System.out.println("教师点名："+name);
    }
}
