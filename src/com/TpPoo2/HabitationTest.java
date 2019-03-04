package com.TpPoo2;

public class HabitationTest {
    public static void main(String[] args) {
        HabIndividuelle hPro=new HabIndividuelle("Mohamed","asfi",350,8,true);
        HabProfessionnelle hInd=new HabProfessionnelle("Yassine","Bruxelle",120,5);
        Commune commune=new Commune(2);
        commune.add(hPro,0);
        commune.add(hInd,1);
        commune.show();

    }
}
