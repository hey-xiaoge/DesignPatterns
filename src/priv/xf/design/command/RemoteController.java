package priv.xf.design.command;

/**
 * 遥控器
 */
public class RemoteController {

    //开 按钮的命令数组
    Command[] onCommands;
    //关 按钮的命令数组
    Command[] offCommands;
    //执行撤销命令
    Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给按钮设置需要的命令
     * @param no：第几组按钮
     * @param onCommand：开命令
     * @param offCommand：关命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int no) {
        //找到你按下的开的按钮，并调用对象方法
        onCommands[no].execute();
        //记录 这次的操作，用于撤销
        undoCommand = onCommands[no];
    }
    //按下关按钮
    public void offButtonWasPushed(int no) {
        //找到你按下的开的按钮，并调用对象方法
        offCommands[no].execute();
        //记录 这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    //按下撤销
    public void undoButtonWasPushed(int no) {
        undoCommand.undo();
    }

}
