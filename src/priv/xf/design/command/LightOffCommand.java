package priv.xf.design.command;


public class LightOffCommand implements Command{

    //聚合LightReceiver
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接受者的方法
        lightReceiver.off();
    }

    @Override
    public void undo() {
        //调用接受者的方法
        lightReceiver.on();
    }
}
