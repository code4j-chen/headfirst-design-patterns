package com.code4j.pizza.factory;

import com.code4j.pizza.Pizza;

/**
 * Created by code4j on 2015/1/14.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
