package com.code4j.duck.strategypattern;

/**
 * Created by code4j on 2015/1/12.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
