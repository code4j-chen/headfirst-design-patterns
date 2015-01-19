package com.code4j.remotecontrol.command;

import com.code4j.remotecontrol.Command;

/**
 * Created by code4j on 2015/1/19.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
