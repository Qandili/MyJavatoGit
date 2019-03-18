package com.TpPoo1.GuichetsBanque;

import java.util.ArrayList;
import java.util.Scanner;

public class GuichetsBanque {
    Boolean[] tabGuichets;

    GuichetsBanque(int n) {
        tabGuichets=new Boolean[n];
        for (int i=0;i<n;i++){
            tabGuichets[i]=(true);
        }
    }
    public int guichetLibre(){
        for (int i=0;i<tabGuichets.length;i++){
            if (tabGuichets[i].equals(true)){
                return i;
            }
        }
        return -1;
    }
    public void modifEtat(int num){
        Scanner in=new Scanner(System.in);
        boolean b=in.nextBoolean();
        tabGuichets[num]=(b);
        System.out.println("l'etat a bien a bien ete modifie");
    }
    int nbGuichetLibre(){
        int counter=0;
        for (int i=0;i<tabGuichets.length;i++){
            if (tabGuichets[i].equals(true)){
                counter++;
            }
        }
        return counter;
    }
}
