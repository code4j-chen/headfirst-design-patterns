package com.code4j.restaurant;

import java.util.Iterator;
/**
 * Created by code4j on 2015/1/26.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> iterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> iterator1 = dinerMenu.createIterator();
        Iterator iterator2 = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(iterator);
        System.out.println("\nLUNCH");
        printMenu(iterator1);
        System.out.println("\nDINNER");
        printMenu(iterator2);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
