package com.Collections.Exo4;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Ensemble {
    Vector<Integer> vector=new Vector<Integer>();

    public Ensemble(Vector<Integer> vector) {
        this.vector = vector;
    }
    void ajouter(int i){
        this.vector.add(i);
    }
    static boolean exist(int i,Ensemble e){
        return e.vector.contains(i);
    }
    public int size(){
        return vector.size();
    }
    void supprimer(int i){
        try {
            vector.remove(i);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Invalid I" +
                    "ndex ");

        }
    }
    public void print(){
        System.out.print("{");
        for (Integer i:vector){
            System.out.print(i+",");
        }
        System.out.println("}");
    }
    static Ensemble getOr(Ensemble e1,Ensemble e2){
        Vector<Integer> vector=new Vector<>();
        int size1=e1.size();
        int size2=e2.size();
        for (int i=0;i<size1;i++){
            if (!Ensemble.exist(e1.vector.get(i),e2)){
                vector.add(e1.vector.get(i));
            }
        }
        for (int i=0;i<size2;i++){
            if (!Ensemble.exist(e2.vector.get(i),e1)){
                vector.add(e2.vector.get(i));
            }
        }
        return new Ensemble(vector);
    }
}
