package com.code4j.duck.strategypattern;


/**
 * Created by code4j on 2015/1/12.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("I'm a model duck");
    }
}
