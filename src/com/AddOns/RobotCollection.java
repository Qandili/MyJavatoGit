package com.AddOns;

import java.util.ArrayList;

public class RobotCollection {
    ArrayList<Robot> robots;

    public RobotCollection() {
        this.robots = new ArrayList<Robot>();
    }

    public void Add(Robot robot){
        this.robots.add(robot);
    }
}
