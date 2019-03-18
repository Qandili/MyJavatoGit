package com.Collections;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("*Trie d'un tableau en implementant Comparable*");
        System.out.println("**********************************************");
        Vector<Personne> vector=new Vector<>();
        Personne personne=new Personne("Imad","Alouli",21);
        vector.add(personne);
        vector.add(new Personne("elqandili","mohamed",20));
        vector.add(new Personne("Derras","Adil",30));
        vector.add(new Personne("Elmissaoui","Amine",27));
        Collections.sort(vector);
        System.out.println("**********************************");
        System.out.println("*Parcour en utilisant Enumeration*");
        System.out.println("**********************************");
        Enumeration<Personne> enu=vector.elements();
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }


//        Sorting personne using the comparator interface
        System.out.println("**********************************************");
        System.out.println("*Trie d'un tableau en implementant Comparator*");
        System.out.println("**********************************************");
        Vector<Personne> personnes=new Vector<Personne>();
        Personne p=new Personne("hh","oo",21);
        Personne p1=new Personne("aa","bb",21);
        Personne p4=new Personne("aa","aa",21);
        Personne p2=new Personne("haha","aa",21);
        personnes.add(p);
        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p4);
        //Trie par nom
        personnes.sort(new PersonneComparatorParNom());
        //Trie par Prenom
        personnes.sort(new PersonneComparatorParPrenom());

        Collections.sort(personnes);
        System.out.println("**********************************");
        System.out.println("*Parcour en utilisant Enumeration*");
        System.out.println("**********************************");
        Enumeration<Personne> enu1=personnes.elements();
        while (enu1.hasMoreElements()){
            System.out.println(enu1.nextElement());
        }
        System.out.println("*******************************");
        System.out.println("*Parcour en utilisant Iterator*");
        System.out.println("*******************************");
        Iterator<Personne> personneIterator=personnes.iterator();
        while (personneIterator.hasNext()){
            Personne r=personneIterator.next();
            System.out.println("  "+r);
        }
        System.out.println(""+Collections.binarySearch(personnes,p,new PersonneComparatorParNom()));
        System.out.println(""+Collections.binarySearch(vector,p1));
        System.out.println("*******************************");
        System.out.println("*Trie en utilisant Arrays     *");
        System.out.println("*******************************");
        Personne[] personnes1=new Personne[4];
        Personne c=new Personne("hh","oo",21);
        Personne c1=new Personne("aa","bb",21);
        Personne c4=new Personne("aa","aa",21);
        Personne c2=new Personne("haha","aa",21);
        personnes1[0]=(c);
        personnes1[1]=(c1);
        personnes1[2]=(c2);
        personnes1[3]=(c4);
        Arrays.sort(personnes1,new PersonneComparatorParPrenom());
        System.out.println("*******************************");
        System.out.println("*Parcour en utilisant forEach*");
        System.out.println("*******************************");
        for (Personne personne1:personnes1) {
            System.out.println(personne1);
        }

    }
}
