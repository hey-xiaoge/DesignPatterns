package priv.xf.design.proxy.staticproxy;

//代理教师（静态代理）
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target; //目标对象（被代理对象），通过接口聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理完成某些操作");
        target.teach();
        System.out.println("操作完成代理结束");
    }
}
