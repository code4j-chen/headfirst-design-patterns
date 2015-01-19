package com.code4j.remotecontrol;

/**
 * Created by code4j on 2015/1/19.
 */
public interface Command {
    public void execute();

    public void undo();
}
