package com.Collections.Exo5;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Scanner;

public class Annuaire {
    HashMap<String,Fiche> annuaire=new HashMap<>();

    public Annuaire(HashMap<String, Fiche> annuaire) {
        this.annuaire = annuaire;
    }
    public Annuaire() {
        this.annuaire = new HashMap<>();
    }
    void rechercherFicheParNom(String nom){
        if (this.annuaire.containsKey(nom)){
            System.out.println(this.annuaire.get(nom));
        }else {
            System.out.println("sorry No information matching your name");
        }
    }

    void ajouterFicheParNom(String nom){
        if (this.annuaire.containsKey(nom)){
            System.out.println("An existing Contact with the same name already exists Do you wish to modify ?");
            System.out.println("enter Y or N");
            Scanner in=new Scanner(System.in);
            String validation=in.nextLine();
            if (validation.equalsIgnoreCase("Y")){
                System.out.println("enter your name");
                String name=in.nextLine();
                System.out.println("enter your lastName");
                String lastName=in.nextLine();
                System.out.println("enter your GSM");
                String gsm=in.nextLine();
                this.annuaire.replace(nom,new Fiche(name,lastName,gsm));
            }else if (validation.equalsIgnoreCase("N")){
                System.out.println("thanks for visiting");
            }else {
                System.out.println("invalid entry");
            }
        }else if  (!this.annuaire.containsKey(nom)) {
            Scanner in=new Scanner(System.in);
            System.out.println("enter your name");
            String name=in.nextLine();
            System.out.println("enter your lastName");
            String lastName=in.nextLine();
            System.out.println("enter your GSM");
            String gsm=in.nextLine();
            this.annuaire.put(nom,new Fiche(name,lastName,gsm));
        }
    }
}
