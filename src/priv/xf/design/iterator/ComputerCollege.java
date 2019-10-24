package priv.xf.design.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartmen = 0; //保存当前数组对象个数


    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("Java专业","Java是世界上最好的语言");
        addDepartment("PHP专业","PHP是世界上最好的语言");
        addDepartment("Python专业","Python是世界上最好的语言");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartmen] = department;
        numOfDepartmen += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
