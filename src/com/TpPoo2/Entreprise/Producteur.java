package com.TpPoo2.Entreprise;

public class Producteur extends Employee {
    int nbUnites;
    static int ProdNo=0;
    int objNo;

    public Producteur(String nom, String preNom, int age, int recrAnne,int nbUnites) {
        super(nom, preNom, age, recrAnne);
        this.nbUnites=nbUnites;
        objNo=ProdNo+1;
    }

    @Override
    public double calculSalaire() {
        return nbUnites * 5;
    }

    @Override
    public void affiche() {
        System.out.println("Producteur No "+objNo++);
        super.affiche();
        System.out.println("nombre d'unite produites mensuellement "+nbUnites);
    }
}
