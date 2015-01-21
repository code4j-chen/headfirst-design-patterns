package com.code4j.beverage;

/**
 * Created by code4j on 2015/1/21.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook  = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
