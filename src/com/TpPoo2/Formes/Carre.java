package com.TpPoo2.Formes;

public class Carre implements Forme {
    private double cote;

    public Carre() {
        this.cote=0;
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double perimetre() {
        return cote*4;
    }

    @Override
    public double aire() {
        return cote*cote;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "cote=" + cote +
                '}';
    }
}
