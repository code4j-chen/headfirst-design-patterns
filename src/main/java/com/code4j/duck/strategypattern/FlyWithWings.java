package com.code4j.duck.strategypattern;

/**
 * Created by code4j on 2015/1/12.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
