package priv.xf.design.command;

/**
 * 没有任何命令，方法空实现
 * 用于初始化每个按钮，当调用空命令时，对象什么都不做
 * 这也是一种设计模式，可以省掉对空判断
 */
public class NoCommand implements Command{


    @Override
    public void execute() {
        //空实现
    }

    @Override
    public void undo() {
       //空实现
    }
}
