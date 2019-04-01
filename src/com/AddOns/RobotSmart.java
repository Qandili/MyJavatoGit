package com.AddOns;

public class RobotSmart extends Robot {
    private boolean turbo=false;

    public RobotSmart(String name, boolean turbo) {
        super(name);
        this.turbo = turbo;
    }

    public RobotSmart(String name, double x, double y, String direction, boolean turbo) {
        super(name, x, y, direction);
        this.turbo = turbo;
    }

    public RobotSmart(String name, double x, double y, String direction) {
        super(name, x, y, direction);
    }

    public RobotSmart(String name) {
        super(name);
    }
    public void avance(double pas) {
        if (turbo){
            for (int i=0;i<3*pas;i++){
                avance();
            }
        }else {
            for (int i=0;i<pas;i++){
                avance();
            }
        }

    }
    public void hello(){
        System.out.println("hello");
    }

    public void gauche() {
        droit();
        droit();
        droit();
    }
    public void demiTour(){
        droit();
        droit();
    }

    @Override
    public String toString() {
        return super.toString() +" \n"+ "RobotSmart :" +
                "turbo=" + turbo;
    }
    //
//    public void avance(double pas) {
//        switch (this.getDirection()){
//            case "est":
//                this.position.setX(this.position.getX()+pas);
//                break;
//            case "ouest":
//                this.position.setX(this.position.getX()-pas);
//                break;
//            case "nord":
//                this.position.setY(this.position.getY()+pas);
//                break;
//            case "sud":
//                this.position.setY(this.position.getY()-pas);
//                break;
//        }
//    }
//
//    public void gauche() {
//        if (this.direction.equalsIgnoreCase("nord")){
//            direction="ouest";
//        }
//        if (this.direction.equalsIgnoreCase("est")){
//            direction="sud";
//        }
//        if (this.direction.equalsIgnoreCase("sud")){
//            direction="est";
//        }
//        if (this.direction.equalsIgnoreCase("ouest")){
//            direction="sud";
//        }
//    }
//    public void demiTour(){
//        if (this.direction.equalsIgnoreCase("nord")){
//            direction="sud";
//        }
//        if (this.direction.equalsIgnoreCase("est")){
//            direction="ouest";
//        }
//        if (this.direction.equalsIgnoreCase("sud")){
//            direction="nord";
//        }
//        if (this.direction.equalsIgnoreCase("ouest")){
//            direction="est";
//        }
//    }

}
