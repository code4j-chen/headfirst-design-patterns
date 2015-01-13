package com.code4j.starbuzz.decorate;

/**
 * Created by code4j on 2015/1/13.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
