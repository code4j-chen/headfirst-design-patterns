package com.code4j.restaurant;

/**
 * Created by code4j on 2015/1/22.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Fakin' Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    /*public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}
