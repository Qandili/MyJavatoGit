package com.TpPoo2;

public class HabProfessionnelle extends Habitation {
    private int nbEmployee;

    public HabProfessionnelle(String proprietaire, String addresse, double surface, int nbEmployee) {
        super(proprietaire, addresse, surface);
        this.nbEmployee = nbEmployee;
    }

    public HabProfessionnelle(String proprietaire, String addresse, double surface) {
        super(proprietaire, addresse, surface);
    }

    @Override
    public double impot() {
        return super.impot() + 60*nbEmployee;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Nombre d'employees "+nbEmployee);
        System.out.println("IMPOT : "+impot());
        System.out.println("Type: Professionelle");
        System.out.println("******************************");
    }
}
