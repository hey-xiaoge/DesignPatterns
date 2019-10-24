package priv.xf.design.iterator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        System.out.println("================= 迭代器模式 =================");

        //创建学院
        List<College> collegeList=new ArrayList<>() ;

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();

    }

}
