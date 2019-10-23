package priv.xf.design.visitor;

public class Man extends Person {
    @Override
    public void accpet(Action action) {
        action.getManResult(this);
    }
}
