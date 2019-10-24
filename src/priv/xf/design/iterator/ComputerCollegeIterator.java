package priv.xf.design.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 计算机学院
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要知道Department 是以怎样的方式存放
    Department[] departments;

    //遍历的位置
    int positon = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否有下一个元素
    @Override
    public boolean hasNext() {
        if (positon >= departments.length || departments[positon] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[positon];
        positon += 1;
        return department;
    }

}
