package com.TpPoo1.Geometrie;

public class Geometrie {
    Point a;
    Point b;
    Point c;

    public Geometrie(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
    private static double calcDistBetPoin(Point a,Point b){
        double firstPart=a.getX()-b.getX();
        double secondPart=a.getY()-b.getY();
        return Math.sqrt(Math.pow(firstPart,2)+Math.pow(secondPart,2));
    }
    public double perimetre(){
        return calcDistBetPoin(this.a,this.b)+calcDistBetPoin(this.b,this.c)+calcDistBetPoin(this.c,this.a);
    }
    public boolean checkIsocele(){
        double AB=calcDistBetPoin(this.a,this.b);
        double BC=calcDistBetPoin(this.b,this.c);
        double AC=calcDistBetPoin(this.c,this.a);
        return AB==BC || BC==AC || AB==AC;
    }

}
