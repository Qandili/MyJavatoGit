package com.TpPoo2;

public class Commune {
    Habitation[] habitations;

    public Commune() {
        this.habitations = new Habitation[]{};
    }
    public Commune(Habitation[] habitations) {
        this.habitations = habitations;
    }
    public Commune(int taille) {
        this.habitations = new Habitation[taille];
    }
    public void add(Habitation habitation,int i){
        habitations[i]=habitation;
    }
    public void show(){
        for (int i=0;i<habitations.length;i++){
            habitations[i].affiche();
        }
    }
}
