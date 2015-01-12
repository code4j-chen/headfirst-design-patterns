package com.code4j.duck.strategypattern;


/**
 * 野鸭
 * Created by code4j on 2015/1/12.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("green");
    }
}
