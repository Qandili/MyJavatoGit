package com.TpPoo1;

public class EssaiSegment {
    public static void main(String[] args) {
        Segment segment1=new Segment(5,3);
        System.out.println(segment1);
        System.out.println("la Longuer de ce segment est "+segment1.longueur());
        System.out.println("ordonnant le segment............");
        segment1.ordonne();
        System.out.println(segment1);
        System.out.println("la Longuer Maintenant est "+segment1.longueur());
        System.out.println("point 8");
        int point=8;
        System.out.println("checking if the point is in segment"+segment1.PointIsinSegment(8));
        System.out.println("hahahahahhahahahaha");

    }
}
