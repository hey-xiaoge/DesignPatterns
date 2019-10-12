package priv.xf.design.prototype.deepclone;

import java.io.*;

/**
 * ----- 原型模式 -----
 * <p>
 * 克隆羊问题：
 * 现在有一只羊，姓名为：Tom，年龄为：1，颜色为：白色。
 * 请编写程序创建和Tom属性完全相同的10只羊
 * <p>
 * 深拷贝方式解决
 */
public class SheepPrototype implements Serializable,Cloneable {

    private String name;
    private int age;
    private String color;
    private SheepCloneableTarget sheepCloneableTarget; //羊 可克隆目标

    public SheepPrototype(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public SheepPrototype(String name, int age, String color, SheepCloneableTarget sheepCloneableTarget) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.sheepCloneableTarget = sheepCloneableTarget;
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

    public SheepCloneableTarget getSheepCloneableTarget() {
        return sheepCloneableTarget;
    }

    public void setSheepCloneableTarget(SheepCloneableTarget sheepCloneableTarget) {
        this.sheepCloneableTarget = sheepCloneableTarget;
    }

    @Override
    public String toString() {
        return "SheepPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sheepCloneableTarget=" + sheepCloneableTarget +
                '}';
    }


    //深拷贝
    // 方式1，使用默认的clone方法完成
    @Override
    protected Object clone() {

        SheepPrototype sp = null;
        SheepCloneableTarget sct = null;
        try {
            sp = (SheepPrototype) super.clone();
            sct = (SheepCloneableTarget) sheepCloneableTarget.clone();
            sp.sheepCloneableTarget = sct;
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sp;
    }

    //深拷贝
    //方式2：通过对象的序列化实现（推荐）
    public Object deepClone() {


        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            SheepPrototype sp = (SheepPrototype) ois.readObject();
            return sp;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
