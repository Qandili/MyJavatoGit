package com.TpPoo2.Entreprise;

public class EntrepriseTest {
    public static void main(String[] args) {
        Employee producteur = new Producteur("mohamed", "elqandili", 21, 2019, 5);
        Employee vendeur = new Vendeur("test ", "test", 19, 2019, 1000);
        Employee representant = new Representant("ahah ", "haha", 18, 2017, 500);
        Personnel personnel = new Personnel(4);
        personnel.ajouterEmploye(producteur);
        personnel.ajouterEmploye(vendeur);
        personnel.ajouterEmploye(representant);
        personnel.show();
        System.out.println("*******************************************");
        Employee producteur1 = new Producteur("mohamed", "elqandili", 21, 2019, 5);
        Employee vendeur1 = new Vendeur("test ", "test", 19, 2019, 1000);
        Employee representant1 = new Representant("ahah ", "haha", 18, 2017, 500);
        Personnel personnel1 = new Personnel(4);
        personnel1.ajouterEmploye(producteur1);
        personnel1.ajouterEmploye(vendeur1);
        personnel1.ajouterEmploye(representant1);
        personnel1.show();
    }
}
