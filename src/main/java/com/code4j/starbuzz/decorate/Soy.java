package com.code4j.starbuzz.decorate;

/**
 * Created by code4j on 2015/1/13.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
