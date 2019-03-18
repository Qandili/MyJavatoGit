package com.Collections;

public class Personne implements Comparable<Personne> {
    String nom;
    String pernom;
    int age;

    public Personne(String nom, String pernom, int age) {
        this.nom = nom;
        this.pernom = pernom;
        this.age = age;
    }

    @Override
    public int compareTo(Personne o) {
        return this.nom.compareTo(o.nom);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", pernom='" + pernom + '\'' +
                ", age=" + age +
                '}';
    }
}
