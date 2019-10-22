package priv.xf.design.command;


public class TVOnCommand implements Command{

    //聚合LightReceiver
    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        //调用接受者的方法
        tvReceiver.on();
    }

    @Override
    public void undo() {
        //调用接受者的方法
        tvReceiver.off();
    }
}
