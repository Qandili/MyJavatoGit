package com.TPException;

public class Cercle {
    private double x, y, rayon;
    private String couleur;

    Cercle(double x, double y, double rayon, String couleur) throws ValRayonValideException, CouleurValideException {
        this.x = x;
        this.y = y;
        if (rayon<0){
            this.rayon = -rayon;
        throw  new ValRayonValideException("Rayon must be positive");}
        else {
            this.rayon = rayon;
        }
        if (couleur.equals("rouge") || couleur.length()==0){
            throw  new CouleurValideException("Red is not allowed");}
        else {
            this.couleur = couleur;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "x=" + x +
                ", y=" + y +
                ", rayon=" + rayon +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
