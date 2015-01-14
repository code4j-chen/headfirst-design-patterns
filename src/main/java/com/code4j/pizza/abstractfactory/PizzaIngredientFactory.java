package com.code4j.pizza.abstractfactory;

/**
 * Created by code4j on 2015/1/14.
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
