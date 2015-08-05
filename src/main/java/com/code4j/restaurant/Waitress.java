package com.code4j.restaurant;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by code4j on 2015/1/26.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

}
