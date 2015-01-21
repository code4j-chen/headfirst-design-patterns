package com.code4j.hometheater;

/**
 * Created by code4j on 2015/1/21.
 */
public class Amplifier {
    private DvdPlayer dvd;
    private int volume;

    public void on() {

    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public DvdPlayer getDvd() {
        return dvd;
    }

    public void setSurroundSound() {

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void off() {

    }
}
