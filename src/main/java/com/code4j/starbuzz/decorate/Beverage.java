package com.code4j.starbuzz.decorate;

/**
 * Created by code4j on 2015/1/13.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
