package com.TpPoo2.Entreprise;

import com.TpPoo2.Habitation;

public class Personnel {
    Employee[] employees;
    int indice = 0;
    static int empNo;

    public Personnel(int taille) {
        employees = new Employee[taille];
    }

    void ajouterEmploye(Employee employe) {
        if (indice < employees.length) {
            employees[indice++] = employe;
        } else {
            System.err.println("la taille de tableau est insufisante");
        }
    }

    public void show() {
        for (int i = 0; i < indice; i++) {
            employees[i].affiche();
        }
    }
    public double salaireMoyen(){
        int sum=0;
        for (int i=0;i<employees.length;i++){
            sum+=employees[i].calculSalaire();
        }
        return sum/employees.length;
    }
    void NbEmployes(){
        for (int i=0;i<employees.length;i++){
            if (employees[i] instanceof Producteur){
                System.out.println("Producteur No "+Producteur.ProdNo);
            }else {
                System.out.println("Commercial No "+Commercial.ComNo);
            }
        }
    }
}