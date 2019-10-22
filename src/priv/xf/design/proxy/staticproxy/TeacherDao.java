package priv.xf.design.proxy.staticproxy;

//被代理对象
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教师正在授课。。。");
    }
}
