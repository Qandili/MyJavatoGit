package com.TPException;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args){
//        int[] a=new int[4];
//        for (int i=0;i<a.length;i++){
//            Scanner scanner=new Scanner(System.in);
//            int n=scanner.nextInt();
//            a[i]=n;
//        }
//        System.out.println("entrer l'indice");
//        Scanner scanner=new Scanner(System.in);
//        int indice=scanner.nextInt();
//        System.out.println("entrer le diviseur");
//        Scanner scanne = new Scanner(System.in);
//        int diviseur = scanne.nextInt();
//        try {
//           int f=(a[indice]/diviseur);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.err.println("division par zero");
////            e.printStackTrace();
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println("vous avez depasser la raille du tableau");
//        }
        try {
            Cercle cercle=new Cercle(1,2,-8,"rouge");
            System.out.println(cercle.getRayon());
        } catch (ValRayonValideException e) {
            System.err.println("rayon");
            e.getMessage();
        }catch (CouleurValideException e){
            System.err.println("color probleme");
            e.getMessage();
        }
        System.out.println();
    }
}
