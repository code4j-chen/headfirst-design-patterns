package com.code4j.pizza.factory;

import com.code4j.pizza.Pizza;

/**
 * Created by code4j on 2015/1/14.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        }else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
}
