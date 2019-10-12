package priv.xf.design.bridge;

public class FlodedPhone extends Phone {


    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("折叠款 --- ");
        super.open();
    }

    @Override
    protected void call() {
        System.out.print("折叠款 --- ");
        super.call();
    }

    @Override
    protected void close() {
        System.out.print("折叠款 --- ");
        super.close();
    }
}
