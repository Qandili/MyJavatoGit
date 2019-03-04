package com.TpPoo2.Formes;

public class Rectangle implements Forme {
    private double largeur;
    private double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }
    public Rectangle() {
        this.largeur = 0;
        this.longueur = 0;
    }
    @Override
    public double perimetre() {
        return (largeur+longueur)*2;
    }

    @Override
    public double aire() {
        return largeur*longueur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "largeur=" + largeur +
                ", longueur=" + longueur +
                '}';
    }
}
