package com.Collections;

import java.util.Comparator;

public class PersonneComparatorParPrenom implements Comparator<Personne> {
    @Override
    public int compare(Personne o1, Personne o2) {
        return o1.pernom.compareTo(o2.pernom);
    }
}
