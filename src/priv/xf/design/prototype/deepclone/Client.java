package priv.xf.design.prototype.deepclone;

public class Client {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        SheepPrototype sheep = new SheepPrototype("Tom", 1, "white");

        sheep.setSheepCloneableTarget(new SheepCloneableTarget("Jack", 2, "black"));

//        System.out.println("原型模式（深拷贝 — 方式一：浅拷贝方式）");
//        SheepPrototype sheep2 = (SheepPrototype) sheep.clone();
//        SheepPrototype sheep3 = (SheepPrototype) sheep.clone();
//        SheepPrototype sheep4 = (SheepPrototype) sheep.clone();
//        SheepPrototype sheep5 = (SheepPrototype) sheep.clone();

        System.out.println("原型模式（深拷贝 — 方式二：序列化方式）");
        SheepPrototype sheep2 = (SheepPrototype) sheep.deepClone();
        SheepPrototype sheep3 = (SheepPrototype) sheep.deepClone();
        SheepPrototype sheep4 = (SheepPrototype) sheep.deepClone();
        SheepPrototype sheep5 = (SheepPrototype) sheep.deepClone();

        System.out.println("sheep2 =" + sheep2 + " sheep2.friend=" + sheep2.getSheepCloneableTarget() + " sheep2.friend.hashCode=" + sheep2.getSheepCloneableTarget().hashCode());
        System.out.println("sheep3 =" + sheep3 + " sheep3.friend=" + sheep3.getSheepCloneableTarget() + " sheep3.friend.hashCode=" + sheep3.getSheepCloneableTarget().hashCode());
        System.out.println("sheep4 =" + sheep4 + " sheep4.friend=" + sheep4.getSheepCloneableTarget() + " sheep4.friend.hashCode=" + sheep4.getSheepCloneableTarget().hashCode());
        System.out.println("sheep5 =" + sheep5 + " sheep5.friend=" + sheep5.getSheepCloneableTarget() + " sheep5.friend.hashCode=" + sheep5.getSheepCloneableTarget().hashCode());

    }

}
