package priv.xf.design.composite;

public class Client {

    public static void main(String[] args) {
        System.out.println("===== 组合模式 =====");

        //从小到大创建对象
        //创建学校
        OrganizationComponent university = new University("中山大学", "中山大学真棒");

        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", " 计算机学院挺不错 ");
        OrganizationComponent infoEngineercollege = new College("信息工程学院", " 信息工程学院更棒 ");

        //创建各个学院下面的系（专业）
        computerCollege.add(new Department("软件工程","软件工程不错"));
        computerCollege.add(new Department("网络工程","网络工程不错"));

        infoEngineercollege.add(new Department("通信工程","通信工程难学"));
        infoEngineercollege.add(new Department("信息工程","信息工程好学"));

        //将学院加入到学校
        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.print();
//        infoEngineercollege.print();
    }

}
