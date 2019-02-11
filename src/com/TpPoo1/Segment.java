package com.TpPoo1;

public class Segment {
    int extrem1;
    int extrem2;
    Segment(int a,int b){
            this.extrem1=a;
            this.extrem2=b;
    }
    public int longueur(){
        return Math.abs(extrem2-extrem1);
    }
    public void ordonne(){
        if (this.extrem1>this.extrem2){
            int temp=this.extrem1;
            this.extrem1=this.extrem2;
            this.extrem2=temp;
        }

    }
    public boolean pointIsinSegment(int point){
        return point>this.extrem1 && point<this.extrem2;
    }

    @Override
    public String toString() {
        return "segment ["+this.extrem1+"," +this.extrem2+"]";
    }

}

