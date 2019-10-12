package priv.xf.design.decorator;

/**
 * 抽象类
 */
public abstract class Drink {

    private String description; //描述
    private float price = 0.0f; //价格

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类实现该方法
    public abstract float cost();

}
