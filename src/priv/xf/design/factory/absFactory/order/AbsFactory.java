package priv.xf.design.factory.absFactory.order;

import priv.xf.design.factory.absFactory.pizza.Pizza;

//一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {

    //让其子类工厂来具体实现
    public Pizza createPizza(String orderType);
}
