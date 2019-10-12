package priv.xf.design.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //重写remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print方法，输出College包含的系
    @Override
    protected void print() {
        System.out.println("----- "+getName()+" -----");
        //遍历
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
