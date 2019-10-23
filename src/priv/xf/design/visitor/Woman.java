package priv.xf.design.visitor;

/**
 * 1.这里使用到了双分派，即首先在客户端程序中，将集体状态作为参数传递到Woman中（第一次分派）
 * 2.然后 Woman类 调用了作为参数的“具体方法”中方法getWomanResult,同时将自己（this）作为参数传递（第二次分派）
 */
public class Woman extends Person {
    @Override
    public void accpet(Action action) {
        action.getWomanResult(this);
    }
}
