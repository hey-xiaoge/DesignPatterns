package priv.xf.design.fiyweight;

//具体网站（内部状态）
public class ConcreteWebSite extends WebSite {

    //共享的部分，内部状态
    private String type = ""; //网站发布的类型

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式为：" + type + "，使用者为：" + user.getName());
    }
}
