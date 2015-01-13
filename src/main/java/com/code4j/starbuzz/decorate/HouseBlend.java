package com.code4j.starbuzz.decorate;

/**
 * Created by code4j on 2015/1/13.
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
