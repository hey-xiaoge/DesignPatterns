package priv.xf.design.command;

public class Client {

    public static void main(String[] args) {
        System.out.println("============ 命令模式 ============");

        //创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置命令
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println( );
        System.out.println("使用遥控器控制电灯");
        System.out.println("-------------- 按下开灯按钮 --------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-------------- 按下关灯按钮 --------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-------------- 按下撤销按钮 --------------");
        remoteController.undoButtonWasPushed(0);

        //创建电灯的对象（接收者）
        TVReceiver tvReceiver = new TVReceiver();

        //创建电灯开关命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        //给遥控器设置命令
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println( );
        System.out.println("使用遥控器控制电视机");
        System.out.println("-------------- 按下关闭电视机按钮 --------------");
        remoteController.offButtonWasPushed(1);
        System.out.println("-------------- 按下开启电视机按钮 --------------");
        remoteController.onButtonWasPushed(1);
        System.out.println("-------------- 按下撤销按钮 --------------");
        remoteController.undoButtonWasPushed(1);
    }
}
