package com.Collections;

import java.util.Comparator;

public class PersonneComparatorParNom implements Comparator<Personne> {

    @Override
    public int compare(Personne o1, Personne o2) {
        return o1.nom.compareTo(o2.nom);
    }

}
