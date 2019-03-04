package com.TpPoo1.JeuxdesPetitsCheveux;

import java.util.ArrayList;

public class Jeux {
    Pion jauneLent ;
    Pion jauneRapide ;
    Pion rougeLent ;
    Pion rougerapide ;

    public Jeux() {
        jauneLent=new Pion("jaune",false,0);
        jauneRapide=new Pion("jaune",true,0);
        rougeLent=new Pion("rouge",false,10);
        rougerapide=new Pion("rouge",true,10);
    }

    public Pion randomPionNonarrive(String couleur){
        if (couleur.equals("rouge")){
            ArrayList<Pion> piona=new ArrayList<>();
            piona.add(rougeLent);
            piona.add(rougerapide);
            int n=(int)( Math.random() * 1);
            for (int i=0;i<piona.size();i++){
                if (piona.get(i).estArrive()){
                    piona.remove(i);
                }
            }
            return piona.get(n);
        }
        ArrayList<Pion> piona=new ArrayList<>();
        piona.add(jauneLent);
        piona.add(jauneRapide);
        int n=(int)( Math.random() * 1);
        for (int i=0;i<piona.size();i++){
            if (piona.get(i).estArrive()){
                piona.remove(i);
            }
        }
        return piona.get(n);
    }

    public void jouerModifier(String couleur){
        Pion pion=randomPionNonarrive(couleur);
        System.out.println(pion.getCouleur());
        if (couleur.equals("jaune")){
            if (pion.getVitesse()){
                int n=(int)( Math.random() * (12 - 2) + 2);
                pion.avancer(n);
            }else {
                int n=(int)( Math.random() * (6 - 1) + 1);
                pion.avancer(n);
            }
        }else if (couleur.equals("rouge")){
            if (pion.getVitesse()){
                int n=(int)( Math.random() * (12 - 2) + 2);
                pion.avancer(n);
            }else {
                int n=(int)( Math.random() * (6 - 1) + 1);
                pion.avancer(n);
            }
        }
    }
    public boolean aGagne(String couleur){
        if (couleur.equals("jaune")){
            return this.jauneLent.estArrive() && this.jauneRapide.estArrive();
        }
        else if (couleur.equals("rouge")){
            return this.rougeLent.estArrive() && this.rougerapide.estArrive();
        }
        return true;
    }
    void jeuComplet(){
        System.out.println(jauneLent.getPosition());
        System.out.println(jauneRapide.getPosition());
        System.out.println(jauneLent.estArrive());
        System.out.println(rougeLent.getPosition());
        System.out.println(rougerapide.getPosition());
        System.out.println("*******************************");

        while (!aGagne("jaune") || !aGagne("rouge")){

            jouerModifier("rouge");
            System.out.println(rougeLent.getPosition());
            System.out.println(rougerapide.getPosition());
            jouerModifier("jaune");
            System.out.println(jauneLent.getPosition());
            System.out.println(jauneRapide.getPosition());
            System.out.println(jauneLent.estArrive());

        }
        if (aGagne("jaune")){
            System.out.println("Victoire au jaune");
        }else if (aGagne("rouge")){
            System.out.println("victoire au rouge");
        }
    }

}






















//    public Pion randomPion(String couleur){
//        if (couleur.equals("rouge")){
//            ArrayList<Pion> piona=new ArrayList<>();
//            piona.add(rougeLent);
//            piona.add(rougerapide);
//            int n=(int)( Math.random() * 1);
//            return piona.get(n);
//        }
//        ArrayList<Pion> piona=new ArrayList<>();
//        piona.add(jauneLent);
//        piona.add(jauneRapide);
//        int n=(int)( Math.random() * 1);
//        return piona.get(n);
//    }
//
//    public void jouer(String couleur){
//        Pion pion=randomPion(couleur);
//        if (couleur.equals("jaune")){
//            if (pion.getVitesse()){
//                int n=(int)( Math.random() * (12 - 1) + 1);
//                pion.avancer(n);
//            }else if(!pion.getVitesse()) {
//                int n=(int)( Math.random() * (6 - 1) + 1);
//                pion.avancer(n);
//            }
//        }else if (couleur.equals("rouge")){
//            if (pion.getVitesse()){
//                int n=(int)( Math.random() * (12 - 1) + 1);
//                pion.avancer(n);
//            }else if(!pion.getVitesse()) {
//                int n=(int)( Math.random() * (6 - 1) + 1);
//                pion.avancer(n);
//            }
//        }
//    }