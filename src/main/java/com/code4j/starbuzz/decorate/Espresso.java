package com.code4j.starbuzz.decorate;

/**
 * Created by code4j on 2015/1/13.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
