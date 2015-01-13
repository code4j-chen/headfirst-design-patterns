package com.code4j.weather;

/**
 * Created by code4j on 2015/1/13.
 */
public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        temperature = getTemperature();
        humidity = getHumidity();
        pressure = getPressure();

    }
}
