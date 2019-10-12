package priv.xf.design.composite;

/**
 * 系
 */
public class Department extends OrganizationComponent {

    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    //因为是叶子节点，所以不要重写add,remove

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
