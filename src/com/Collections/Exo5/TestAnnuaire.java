package com.Collections.Exo5;

import java.util.Scanner;

public class TestAnnuaire {
    public static void main(String[] args) {

        Annuaire annuaire = new Annuaire();

        String quite="n";
        while (quite.equalsIgnoreCase("n")){
            System.out.println("entrez un nom");
            Scanner in=new Scanner(System.in);
            String nom=in.nextLine();
            annuaire.ajouterFicheParNom(nom);
            System.out.println("do you wish to quite? Y/N");
            quite=in.nextLine();
            if (quite.equalsIgnoreCase("y")){
                System.out.println("thanks for visiting");
            }
        }
        System.out.println(annuaire.annuaire.get("Elqandili"));

    }
}
