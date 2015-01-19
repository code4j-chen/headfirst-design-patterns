package com.code4j.remotecontrol.command;

import com.code4j.remotecontrol.Command;

/**
 * Created by code4j on 2015/1/19.
 */
public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {

    }
}
