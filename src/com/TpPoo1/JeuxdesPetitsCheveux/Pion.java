package com.TpPoo1.JeuxdesPetitsCheveux;

public class Pion {
    private String couleur;
    private boolean vitesse ;
    private int position ;

    public Pion(String couleur, boolean vitesse) {
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.position=0;
    }

    public Pion(String couleur, boolean vitesse, int position) {
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.position = position;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boolean getVitesse() {
        return vitesse;
    }

    public void setVitesse(boolean vitesse) {
        this.vitesse = vitesse;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public boolean estArrive(){
        if (this.couleur.equals("jaune")){
            return this.position>=29;
        }
         else if (this.couleur.equals("rouge")){
            return this.position>=39;
        }
        return false;
    }
    public void avancer(int n){
        int p=0;
        if (this.couleur.equals("jaune")){
            if (n+this.position>29){
                p=n-(n+this.position-29);
                this.position+=p;
            }else {
                this.position+=n;
            }
        }
         else if (this.couleur.equals("rouge")){
            if (n+this.position>39){
                p=n-(n+this.position-39);
                this.position+=p;
            }else {
                this.position+=n;
            }
        }
    }
    static void avancer(int n, Pion p){
        int c=0;
        if (p.couleur.equals("jaune")){
            if (n+p.position>29){
                c=n-(n+p.position-29);
                p.position+=c;
            }else {
                p.position+=n;
            }
        }
        else if (p.couleur.equals("rouge")){
            if (n+p.position>39){
                c=n-(n+p.position-39);
                p.position+=c;
            }else {
                p.position+=n;
            }
        }
    }
    void avancerAvecConflit(int n, Pion pio){
        avancer(n);
        if (this.position==pio.position){
            if (this.couleur.equals("jaune")){
                pio.position=10;
            }else {
                pio.position=0;
            }
        }
    }
}
