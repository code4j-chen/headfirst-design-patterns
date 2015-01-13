package com.code4j.weather.observer;

/**
 * Created by code4j on 2015/1/13.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    public void notifyObservers();
}
