package com.code4j.beverage;

/**
 * Created by code4j on 2015/1/21.
 */
public class Tea extends CaffeineBeverage{
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
}
