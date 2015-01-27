package com.code4j.restaurant;

import java.util.Hashtable;

/**
 * Created by code4j on 2015/1/27.
 */
public class CafeMenu {
    Hashtable<String, MenuItem> menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fies", "Veggie burger on a whole wheat bun, lettuce", true, 3.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable<String, MenuItem> getItems() {
        return menuItems;
    }
}
