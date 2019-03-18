package com.Collections.Exo4;

import java.util.Vector;

public class TestEnsemble {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(1);vector.add(5);vector.add(7);vector.add(8);vector.add(9);vector.add(3);vector.add(6);
        Vector<Integer> vector1=new Vector<>();
        vector1.add(2);vector1.add(0);vector1.add(3);vector1.add(8);vector1.add(9);vector1.add(7);
        Ensemble ensemble=new Ensemble(vector);
        Ensemble ensemble1=new Ensemble(vector1);
        ensemble.print();
        ensemble1.print();
        Ensemble.getOr(ensemble,ensemble1).print();
    }
}
