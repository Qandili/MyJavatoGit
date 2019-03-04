package com.TpPoo2;

public class Commune {
    Habitation[] habitations;
    int indice=0;


    public Commune(int taille) {
        this.habitations = new Habitation[taille];
    }
    public void add(Habitation habitation){
        habitations[indice++]=habitation;
    }
    public void show(){
        for (int i=0;i<habitations.length;i++){
            habitations[i].affiche();
        }
    }
}
