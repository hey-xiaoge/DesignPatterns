package priv.xf.design.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    //学院的集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院，然后调用printDepartment 输出各个学院的系
    public void printCollege() {
        //collegeList 取出所有的学院
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("============= "+college.getName()+" =============");
            printDepartment(college.createIterator());
        }
    }

    //输出 学院 输出 系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName()+" "+d.getDesc());
        }
    }

}
