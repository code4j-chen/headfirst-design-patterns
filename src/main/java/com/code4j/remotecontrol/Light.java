package com.code4j.remotecontrol;

/**
 * Created by code4j on 2015/1/19.
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Light is On.");
    }

    public void off() {
        System.out.println(name + " Light is Off.");
    }
}
