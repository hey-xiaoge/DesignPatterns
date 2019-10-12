package priv.xf.design.decorator;

public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDescription("巧克力");
        setPrice(4.0f);
    }
}
