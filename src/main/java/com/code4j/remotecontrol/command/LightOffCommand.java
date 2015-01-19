package com.code4j.remotecontrol.command;

import com.code4j.remotecontrol.Command;
import com.code4j.remotecontrol.Light;

/**
 * Created by code4j on 2015/1/19.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
