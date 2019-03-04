package com.TpPoo2.Entreprise;

public class Vendeur extends Commercial {

    public Vendeur(String nom, String preNom, int age, int recrAnne, double chiffreAffaire) {
        super(nom, preNom, age, recrAnne, chiffreAffaire);
    }

    @Override
    public double calculSalaire() {
        return ((chiffreAffaire*20)/100)+400;
    }
}
