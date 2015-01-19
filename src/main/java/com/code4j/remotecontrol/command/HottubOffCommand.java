package com.code4j.remotecontrol.command;

import com.code4j.remotecontrol.Command;

/**
 * Created by code4j on 2015/1/19.
 */
public class HottubOffCommand implements Command{
    Hottub hottub;
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {

    }
}
