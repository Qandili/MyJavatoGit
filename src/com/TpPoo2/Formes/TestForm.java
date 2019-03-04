package com.TpPoo2.Formes;

public class TestForm {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(2,2);
        Carre carre=new Carre(3);
        Forme[] formes=new Forme[2];
        formes[0]=rectangle;
        formes[1]=carre;

        System.out.println(rectangle);
        System.out.println("l'air de rectangle "+formes[0].aire());
        System.out.println("le perimetre de rectangle "+formes[0].perimetre());
        System.out.println("*******************");
        System.out.println(carre);
        System.out.println("l'air de Carre "+formes[1].aire());
        System.out.println("le perimetre de Carre "+formes[1].perimetre());

    }
}
