package priv.xf.design.prototype;

/**
 * ----- 原型模式 -----
 * <p>
 * 克隆羊问题：
 * 现在有一只羊，姓名为：Tom，年龄为：1，颜色为：白色。
 * 请编写程序创建和Tom属性完全相同的10只羊
 * <p>
 * 传统方式解决
 */
public class Sheep {

    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
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

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
    }

}
