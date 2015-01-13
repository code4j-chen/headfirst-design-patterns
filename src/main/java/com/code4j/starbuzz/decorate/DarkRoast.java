package com.code4j.starbuzz.decorate;

/**
 * Created by code4j on 2015/1/13.
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .72;
    }
}
