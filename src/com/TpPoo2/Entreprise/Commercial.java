package com.TpPoo2.Entreprise;

public abstract class Commercial extends Employee {
    double chiffreAffaire;
    static int ComNo;
    int objNo;

    public Commercial(String nom, String preNom, int age, int recrAnne,double chiffreAffaire) {
        super(nom, preNom, age, recrAnne);
        this.chiffreAffaire=chiffreAffaire;
        objNo=ComNo+1;
        ComNo++;
    }


    @Override
    abstract public double calculSalaire();

    @Override
    public void affiche() {
        System.out.println("Comercial No "+objNo);
        super.affiche();
        System.out.println("chiffre d'affaire "+this.chiffreAffaire);
    }
}
