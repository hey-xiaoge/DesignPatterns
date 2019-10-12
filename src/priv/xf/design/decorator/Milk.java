package priv.xf.design.decorator;

public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        setDescription("牛奶");
        setPrice(3.0f);
    }
}
