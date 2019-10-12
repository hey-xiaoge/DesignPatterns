package priv.xf.design.decorator;

/**
 * 装饰者
 */
public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        return getPrice() + obj.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "：" + getPrice() + " " + obj.getDescription();
    }
}
