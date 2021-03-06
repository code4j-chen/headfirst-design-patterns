package com.code4j.pizza.factory;

import com.code4j.pizza.Pizza;

/**
 * Created by code4j on 2015/1/14.
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
