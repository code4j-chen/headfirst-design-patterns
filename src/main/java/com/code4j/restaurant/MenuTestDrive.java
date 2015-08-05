package com.code4j.restaurant;

/**
 * Created by code4j on 2015/1/26.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        /*PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();*/

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course！");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
