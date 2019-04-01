package com.AddOns;

public class TestRobot {
    public static void main(String[] args) {
        Robot robo = new Robot("Robo", 2,3,"nord");
//        System.out.println(robo);
        RobotSmart robos = new RobotSmart("Robos", 2,3,"nord");
//        System.out.println(robos);
//        RobotCollection robotCollection=new RobotCollection();
//        robotCollection.Add(robo);
//        robotCollection.Add(robos);
//        for (int i=0;i<robotCollection.robots.size();i++){
//            System.out.println("************************");
//            System.out.println(robotCollection.robots.get(i));
//            System.out.println("************************");
//        }
        Robot[] robots=new Robot[2];
        robots[0]=robo;
        robots[1]=robos;
        robots[0].avance();
        robots[0].affiche();
        robots[1].affiche();
        robots[1].avance(2);
        robots[1].affiche();

    }
}
