package com.code4j.movie;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by code4j on 2015/1/20.
 */
public class IteratorEnumeration implements Enumeration{
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
