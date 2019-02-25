package com.TpPoo1.GuichetsBanque;

import java.util.Scanner;

public class GuichetTest {
    public static void main(String[] args) {
        GuichetsBanque guichetTest=new GuichetsBanque(5);
        System.out.println("le tableau des guichets: ");
        for (int i=0;i<guichetTest.tabGuichets.length;i++){
            System.out.print(guichetTest.tabGuichets[i]);
            System.out.println("\t");
        }
        System.out.println("le numero premier guichet libre est "+guichetTest.guichetLibre());
        Scanner in=new Scanner(System.in);
        System.out.println("entrer le nombre de guichet que vous voullez modifier");
        int no=in.nextInt();
        System.out.println("ce guichet marche ou bien en panne? true/false");
        guichetTest.modifEtat(no);
        System.out.println("le tableau maintenant est : ");
        for (int i=0;i<guichetTest.tabGuichets.length;i++){
            System.out.print(guichetTest.tabGuichets[i]);
            System.out.println("\t");
        }
        System.out.println("le nombre des guichets Libre est "+guichetTest.nbGuichetLibre());

    }
}
