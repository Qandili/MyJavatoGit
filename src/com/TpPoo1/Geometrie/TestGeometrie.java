package com.TpPoo1.Geometrie;

public class TestGeometrie {
    public static void main(String[] args) {
        Geometrie traingle1=new Geometrie(new Point(1,2),new Point(3,4),new Point(5,6));
        System.out.println("perimeter of triangle1 is "+traingle1.perimetre());
        System.out.println("is it Isocele? "+traingle1.checkIsocele());
    }
}
