package com.TpPoo2.Entreprise;

abstract public class Employee {
    String nom;
    String preNom;
    int age;
    int recrAnne;

    public Employee(String nom, String preNom, int age, int recrAnne) {
        this.nom = nom;
        this.preNom = preNom;
        this.age = age;
        this.recrAnne = recrAnne;
    }
    public void affiche(){
        System.out.println( "Employee{" +
                "nom='" + nom + '\'' +
                ", preNom='" + preNom + '\'' +
                ", age=" + age +
                ", recrAnne=" + recrAnne +
                '}');
    }
    public abstract double calculSalaire();
}
