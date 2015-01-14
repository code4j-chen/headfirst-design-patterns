package com.code4j.pizza.factory;

import com.code4j.pizza.CheesePizza;
import com.code4j.pizza.PepperoniPizza;
import com.code4j.pizza.Pizza;
import com.code4j.pizza.VeggiePizza;

/**
 * Created by code4j on 2015/1/14.
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
