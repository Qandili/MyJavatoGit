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
    }
}
