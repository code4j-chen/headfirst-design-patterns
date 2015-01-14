package com.code4j.pizza.factory;

/**
 * Created by code4j on 2015/1/14.
 */
public class ChicagoStyleCheesePizza extends com.code4j.pizza.Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
