package priv.xf.design.bridge;

//抽象类
public abstract class Phone {

    //聚合一个行为实现类的接口
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void call() {
        brand.call();
    }

    protected void close() {
        brand.close();
    }
}
