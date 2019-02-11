package com.TpPoo1.ComplexNumbers;

public class TestComplex {
    public static void main(String[] args) {
        Complexe mycomplex=new Complexe(1,2);
        System.out.println("this is my first Complex No "+ mycomplex);
        Complexe addedcomplex=new Complexe(1,2);
        System.out.println("we will add this number "+addedcomplex);
        System.out.println("adding a complex Number to the current Complex .......");
        mycomplex.addComplexNumber(addedcomplex);
        System.out.println(mycomplex);
        System.out.println("Now we will use The static fucntion to add two complex numbers");
        Complexe a=new Complexe(3,4);
        Complexe b=new Complexe(5,6);
        System.out.println("("+a+") + ("+b+")");
        System.out.println("Acessing the method from the class "+Complexe.addTwoComplex(a,b));

    }
}
