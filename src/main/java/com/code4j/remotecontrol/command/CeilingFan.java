package com.code4j.remotecontrol.command;

/**
 * Created by code4j on 2015/1/19.
 */
public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " ceiling fan is on high");
    }

    public void off() {
        System.out.println(name + " ceiling fan is off");
    }
}
