package priv.xf.design.prototype.shallowclone;

/**
 * ----- 原型模式 -----
 * <p>
 * 克隆羊问题：
 * 现在有一只羊，姓名为：Tom，年龄为：1，颜色为：白色。
 * 请编写程序创建和Tom属性完全相同的10只羊
 * <p>
 * 浅拷贝方式解决
 */
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;
    private Sheep friend; //引用类型，

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep(String name, int age, String color, Sheep friend) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
    }


    //克隆该实例，使用默认的clone方法完成

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
