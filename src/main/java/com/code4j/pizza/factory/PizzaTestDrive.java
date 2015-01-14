package com.code4j.pizza.factory;

import com.code4j.pizza.Pizza;

/**
 * Created by code4j on 2015/1/14.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza1.getName() + "\n");
    }
}
