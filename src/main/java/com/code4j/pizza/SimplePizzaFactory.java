package com.code4j.pizza;

/**
 * Created by code4j on 2015/1/14.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
