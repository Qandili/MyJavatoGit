package com.TpPoo2;

public class Habitation {
    private String proprietaire;
    private String addresse;
    private double surface;

    public Habitation(String proprietaire, String addresse, double surface) {
        this.proprietaire = proprietaire;
        this.addresse = addresse;
        this.surface = surface;
    }

    public double impot(){
        return 10*surface;
    }
    public void affiche(){
        System.out.println("******************************");
        System.out.println("Nom de ptoprietere :"+proprietaire);
        System.out.println("addresse :"+addresse);
        System.out.println("surface :"+surface);
    }



}
