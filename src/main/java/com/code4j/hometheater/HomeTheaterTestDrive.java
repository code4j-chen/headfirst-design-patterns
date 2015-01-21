package com.code4j.hometheater;

/**
 * Created by code4j on 2015/1/21.
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CdPlayer(),
                new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
