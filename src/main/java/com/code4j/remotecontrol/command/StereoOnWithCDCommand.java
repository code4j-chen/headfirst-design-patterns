package com.code4j.remotecontrol.command;

import com.code4j.remotecontrol.Command;

/**
 * Created by code4j on 2015/1/19.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
