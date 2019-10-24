package priv.xf.design.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    //这里我们需要知道Department 是以怎样的方式存放
    List<Department> departmentList;

    //遍历的位置
    int index = 0;


    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断是否有下一个元素
    @Override
    public boolean hasNext() {
        if (index > departmentList.size()-1) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departmentList.get(index++);
        return department;
    }

}
