package priv.xf.design.bridge;

public class TouchPhone extends Phone {


    public TouchPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("触屏款 --- ");
        super.open();
    }

    @Override
    protected void call() {
        System.out.print("触屏款 --- ");
        super.call();
    }

    @Override
    protected void close() {
        System.out.print("触屏款 --- ");
        super.close();
    }
}
