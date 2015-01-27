package com.code4j.restaurant;
import java.util.Iterator;
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

    @Override
    public void remove() {
//        throw new UnsupportedOperationException();
        if (position <= 0) {
            throw new IllegalStateException();
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
