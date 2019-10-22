package priv.xf.design.template.improve;

/**
 * 模板类
 * 豆浆抽象类
 */
public abstract class SoyaMilk {

    //模板方法，可以写成final，不允许子类覆盖
    final void make() {
        select();
        if (cusomerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    //选材料
    private void select() {
        System.out.println("选择黄豆");
    }

    //添加不同的配料，抽象方法，子类具体实现
    abstract void addCondiments();

    //浸泡
    private void soak() {
        System.out.println("黄豆和配料开始浸泡，3小时");
    }

    //打碎
    private void beat() {
        System.out.println("将黄豆和配料打碎");
    }

    /**
     * 钩子方法
     * 是否需要添加配料
     * @return
     */
    boolean cusomerWantCondiments() {
        return true;
    }

}
