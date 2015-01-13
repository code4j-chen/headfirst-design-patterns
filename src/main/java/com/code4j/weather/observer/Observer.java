package com.code4j.weather.observer;

/**
 * Created by code4j on 2015/1/13.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
