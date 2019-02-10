package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static int NumberofAro(String email){
        int counter=0;
        for (int i=0;i<email.length();i++){
            if (email.charAt(i)=='@'){
                counter++;
            }
        }
        return counter;
    }
    public static int NumberofPoint(String email){
        int counter=0;
        for (int i=0;i<email.length();i++){
            if (email.charAt(i)=='.'){
                counter++;
            }
        }
        return counter;
    }
    //    -Le premier caractère n'est pas un chiffre
    public static boolean validateEmail(String email){
        if (Character.isDigit(email.charAt(0))){
            return false;
        }
        //    -Un seul caractère arobase ( @ ) ok
        //    -Un seul caractère point ( . ) ok
        if (NumberofAro(email)!=1 || NumberofPoint(email)!=1){
            return false;
        }
        //    -Au minimum 3 caractères avant le caractère @ ok
        String[] splitedbyAr=email.split("@");
        if (splitedbyAr[0].length()<3){
            return false;
        }
        //    -Le caractère point se trouve après le caractère @ ok
        if (!splitedbyAr[1].contains(".") ){
            return false;
        }
        //    -Au moins 5 caractères avant le caractère point ok.
        int j=0;
        int counter1=0;
        while (email.charAt(j)!='.'){
            counter1++;
            j++;
        }
        if (counter1<5){
            return false;
        }

        return true;
    }
    public static int binTodec(int[] bin){

        int n=bin.length;
        int somme=0;
        for(int i=0;i<n;i++){
            somme+=bin[i]*Math.pow(2,(n-1)-i);
        }
        return somme;
    }
    public static int binTodecString(String bin){

        int n=bin.length();
        int somme=0;
//        int x=(int)(Math.pow(2,(n-1)-0));
//        int y=Integer.parseInt((String.valueOf(bin.charAt(0))));
        for(int i=0;i<n;i++){
            somme+=Integer.parseInt((String.valueOf(bin.charAt(i))))*Math.pow(2,(n-1)-i);

        }
        return somme;
    }
    public static ArrayList<Integer> decimalToBinary(int decimal){
        int rest;
        int div;
        ArrayList<Integer> binary=new ArrayList();
        int i=0;
        do {
            div=decimal/2;
            rest=decimal%2;
            decimal=div;
            binary.add(rest);
            i++;
        }while (div!=0);
        for (int j=0;j<binary.size()-1;j++){
            int temp;
            temp=binary.get(j);
            binary.set(j,binary.get(j+1));
            binary.set(j+1,temp);
        }
        return binary;
    }
    public static int lengthLAS(int[] array){
        int n=array.length;
        int tempCounter=1;
        int maxCounter=1;
        int nextElem=0;
        for(int i=0;i<n-1;i++){
            nextElem=i+1;
            if (array[i+1]==array[i]+1 ) {
                ++tempCounter;
            }else if(tempCounter>maxCounter){
                maxCounter=tempCounter;
                tempCounter=1;
            }else {
                tempCounter=1;
            }
        }
        return Math.max(tempCounter,maxCounter);
    }
    public static int sommeParties(int n, int p){
        int div=n/100;
        int rest=n%100;
        return div+rest;
    }
    public static boolean estKaprekar(int n){
        boolean isKaperkar=false;
        int counter=0;
        int div;
        int temp=n;
        do{
            div=temp/10;
            temp=div;
            counter++;
        }while (div!=0);
        for(int i=0;i<counter;i++){
            if (n==sommeParties((int) Math.pow(n,2),i)){
                isKaperkar=true;
            }
        }
        return isKaperkar;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String myEmail=in.nextLine();
        System.out.println(validateEmail(myEmail));
        int[] bin=new int[]{1,1,1,1};
        System.out.println(binTodecString("1111"));
        ArrayList<Integer> conv=decimalToBinary(10);
        for (int i=0;i<conv.size();i++){
            System.out.println(conv.get(i));
        }
        System.out.println(lengthLAS (new int[] {1, 1, 2, 3, 4, 7, 9}));
        System.out.println(lengthLAS (new int[] {1, 2, 3, 1, 2, 1, 2, 1, 9}));
        System.out.println(sommeParties(12540,2));
        System.out.println(estKaprekar(45));


    }

}
