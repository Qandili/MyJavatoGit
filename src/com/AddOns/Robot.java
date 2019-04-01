package com.AddOns;

public class Robot {
    protected String name;
    protected Position position;
    protected String direction;

    public Robot(String name, double x, double y, String direction) {
        this.name = name;
        position=new Position(x,y);
        if (!direction.equalsIgnoreCase("est") &&
                !direction.equalsIgnoreCase("sud") &&
                !direction.equalsIgnoreCase("ouest") &&
                !direction.equalsIgnoreCase("nord")){
            System.out.println("direction must be est/ouest/nord/sud");
        }else {
            this.direction = direction;
        }
    }

    public Robot(String name) {
        this.name = name;
        this.position=new Position(0,0);
        this.direction="est";

    }

    public void avance(){
        switch (direction){
            case "est":
                position.x++;
                break;
            case "ouest":
                position.x--;
                break;
            case "nord":
                position.y++;
                break;
            case "sud":
                position.y--;
                break;
        }
    }
    public void avance(double a){
    }

    public void droit(){
        if (this.direction.equalsIgnoreCase("Nord")){
            this.direction="est";
        }
        if (this.direction.equalsIgnoreCase("Est")){
            this.direction="sud";
        }
        if (this.direction.equalsIgnoreCase("sud")){
            this.direction="ouest";
        }
        if (this.direction.equalsIgnoreCase("ouest")){
            this.direction="nord";
        }
    }
    public void affiche(){
        System.out.println("Robot name: "+this.name);
        System.out.println("Position: ("+this.position.x+" , "+this.position.y+")");
        System.out.println("Direction: "+this.direction);
    }

    @Override
    public String toString(){
       return "Robot name: "+this.name+"\n"+"Position: ("+this.position.x+" , "+this.position.y+")"+"\nDirection: "+this.direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    class Position{
        private double x;
        private double y;

        public Position(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
}

