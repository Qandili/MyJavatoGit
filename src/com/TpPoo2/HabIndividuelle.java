package com.TpPoo2;

public class HabIndividuelle extends Habitation{
    private int NbPieces;
    private boolean piscine;

    public HabIndividuelle(String proprietaire, String addresse, double surface) {
        super(proprietaire, addresse, surface);
    }

    public HabIndividuelle(String proprietaire, String addresse, double surface, int nbPieces, boolean piscine) {
        super(proprietaire, addresse, surface);
        NbPieces = nbPieces;
        this.piscine = piscine;
    }

    @Override
    public double impot() {
        if (piscine){
            return super.impot() + 100*NbPieces + 400;

        }
        return super.impot() + 100*NbPieces;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Nombre de piece "+NbPieces);
        if (piscine){
            System.out.println("avec piscine");
        }
        System.out.println("IMPOT : "+impot());
        System.out.println("Type: Individuelle");
        System.out.println("******************************");

    }
}
