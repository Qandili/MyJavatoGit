package com.TpPoo1.ComplexNumbers;

public class Complexe {
    private double realPart;


    private double imaginaryPart;

    public Complexe(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public void addComplexNumber(Complexe num){
        this.realPart=num.realPart+this.realPart;
        this.imaginaryPart=num.imaginaryPart+this.imaginaryPart;
    }
    public static Complexe addTwoComplex(Complexe a,Complexe b){
        return new Complexe(a.realPart+b.realPart,a.imaginaryPart+b.imaginaryPart);
    }

    @Override
    public String toString() {
        return realPart+" + " +imaginaryPart+"i ";
    }

}
