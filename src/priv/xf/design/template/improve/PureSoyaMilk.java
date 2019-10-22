package priv.xf.design.template.improve;

//纯豆浆类
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean cusomerWantCondiments() {
        return false;
    }
}
