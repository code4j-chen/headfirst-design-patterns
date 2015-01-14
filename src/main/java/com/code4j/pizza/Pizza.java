package com.code4j.pizza;

import java.util.ArrayList;

/**
 * Created by code4j on 2015/1/14.
 */
public class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("     " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
