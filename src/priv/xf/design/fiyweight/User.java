package priv.xf.design.fiyweight;

//外部状态
public class User {

    private String name; //使用者名称

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
