package com.code4j.restaurant;

import java.util.Iterator;
/**
 * Created by code4j on 2015/1/26.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> iterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> iterator1 = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(iterator);
        System.out.println("\nLUNCH");
        printMenu(iterator1);
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
