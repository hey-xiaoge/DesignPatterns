package priv.xf.design.adapter.objectadapter;

/**
 * 适配器类
 */
public class VoltageAdapter   implements IVoltage5V {

    //聚合一个被适配者
    private Voltage220V voltage220V;

    //通过构造器，传入一个Voltage220V（被适配者）实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int detV = 0;
        if (null != voltage220V) {
            int src=voltage220V.output220V();//获取220v 电压
            System.out.println("使用对象适配器，进行适配～");
            detV = src / 44;
            System.out.println("适配完成，输出电压为：" + detV);
        }
        return detV;
    }
}
