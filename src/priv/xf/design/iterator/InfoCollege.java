package priv.xf.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    List<Department> departmentList;
    int numOfDepartmen = 0; //保存当前数组对象个数


    public InfoCollege() {
        this.departmentList = new ArrayList<Department>();
        addDepartment("Java专业", "Java是世界上最好的语言");
        addDepartment("PHP专业", "PHP是世界上最好的语言");
        addDepartment("Python专业", "Python是世界上最好的语言");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
        numOfDepartmen += 1;
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
