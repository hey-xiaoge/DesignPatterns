package priv.xf.design.prototype.shallowclone;

public class Client {

    public static void main(String[] args) {

        System.out.println("原型模式（浅拷贝）");
        // TODO Auto-generated method stub
        Sheep sheep = new Sheep("Tom", 1, "white");

        sheep.setFriend(new Sheep("Jack", 2, "black"));

        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println("sheep2 =" + sheep2 + " sheep2.friend=" + sheep2.getFriend() + " sheep2.friend.hashCode=" + sheep2.getFriend().hashCode());
        System.out.println("sheep3 =" + sheep3 + " sheep3.friend=" + sheep3.getFriend() + " sheep3.friend.hashCode=" + sheep3.getFriend().hashCode());
        System.out.println("sheep4 =" + sheep4 + " sheep4.friend=" + sheep4.getFriend() + " sheep4.friend.hashCode=" + sheep4.getFriend().hashCode());
        System.out.println("sheep5 =" + sheep5 + " sheep5.friend=" + sheep5.getFriend() + " sheep5.friend.hashCode=" + sheep5.getFriend().hashCode());

    }

}
