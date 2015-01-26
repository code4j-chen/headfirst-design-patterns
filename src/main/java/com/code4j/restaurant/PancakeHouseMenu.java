package com.code4j.restaurant;

import java.util.ArrayList;

/**
 * Created by code4j on 2015/1/22.
 */
public class PancakeHouseMenu {
    ArrayList menuList;

    public PancakeHouseMenu() {
        menuList = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", false, 2.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuList.add(menuItem);
    }

    /*public ArrayList getMenuList() {
        return menuList;
    }*/
    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(this.menuList);
    }
}
