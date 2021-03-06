package com.code4j.remotecontrol.command;

/**
 * Created by code4j on 2015/1/19.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("ceiling fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("ceiling fan is low");
    }

    public void on() {
        System.out.println("ceiling fan is on");
    }

    public void off() {
        speed = OFF;
        System.out.println("ceiling fan is off");
    }

    public int getSpeed() {
        return this.speed;
    }
}
