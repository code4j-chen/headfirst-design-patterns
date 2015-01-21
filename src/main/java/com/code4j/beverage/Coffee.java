package com.code4j.beverage;

/**
 * Created by code4j on 2015/1/21.
 */
public class Coffee extends CaffeineBeverage{

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

}
