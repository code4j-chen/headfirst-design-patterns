package com.code4j.restaurant;

/**
 * Created by code4j on 2015/1/26.
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position += 1;
        return item;
    }
}
