package com.Collections.Exo5;

public class Fiche {
    String Nom;
    String Prenom;
    String gsm;
    String adresse;

    public Fiche(String nom, String prenom, String gsm, String adresse) {
        Nom = nom;
        Prenom = prenom;
        this.gsm = gsm;
        this.adresse = adresse;
    }
    public Fiche(String nom, String prenom, String gsm) {
        Nom = nom;
        Prenom = prenom;
        this.gsm = gsm;
        this.adresse = "";
    }

    @Override
    public String toString() {
        return "Fiche{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", gsm='" + gsm + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
