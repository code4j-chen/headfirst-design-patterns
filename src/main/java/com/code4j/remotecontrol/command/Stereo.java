package com.code4j.remotecontrol.command;

/**
 * Created by code4j on 2015/1/19.
 */
public class Stereo {
    private String name;

    public Stereo(String s) {
        this.name = s;
    }

    public void on() {
        System.out.println("Stereo is On");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Stereo is set for cd input");
    }

    public void setDvd() {

    }

    public void setRadio() {

    }

    public void setVolume(int i) {
        System.out.println("Stereo set volume to " + i);
    }
}
