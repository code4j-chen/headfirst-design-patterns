package com.code4j.beverage;

/**
 * Created by code4j on 2015/1/21.
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    void boilWater(){
        System.out.println("Boiling water");
    }
}
