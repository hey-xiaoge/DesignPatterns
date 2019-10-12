package priv.xf.design.decorator;

public class Coffee extends Drink{

    @Override
    public float cost() {
        return getPrice();
    }
}
