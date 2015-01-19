package com.code4j.remotecontrol.command;

/**
 * Created by code4j on 2015/1/19.
 */
public class TV {
    private String name;

    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("TV is Open");
    }

    public void off() {
        System.out.println("TV is off");
    }
}
