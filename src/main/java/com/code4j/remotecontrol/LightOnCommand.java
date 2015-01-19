package com.code4j.remotecontrol;

/**
 * Created by code4j on 2015/1/19.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
