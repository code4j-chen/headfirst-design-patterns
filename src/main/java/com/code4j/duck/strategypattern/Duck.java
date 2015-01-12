package com.code4j.duck.strategypattern;

/**
 * Created by code4j on 2015/1/12.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performQuack(){
        quackBehavior.quack();
    }
    protected void swim() {
        System.out.println("swim");
    }

    protected void display() {
        System.out.println("display");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
