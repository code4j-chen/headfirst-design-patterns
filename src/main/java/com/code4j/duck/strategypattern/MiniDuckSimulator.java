package com.code4j.duck.strategypattern;

/**
 * Created by code4j on 2015/1/12.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        /*Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();*/
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
