package priv.xf.design.adapter.interfaceadapter;

public class Clinet {
    public static void main(String[] args) {

        System.out.println("----- 接口适配器模式 -----");

        AbsAdapter absAdapter=new AbsAdapter(){
            //只重写我们需要的方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }
}
