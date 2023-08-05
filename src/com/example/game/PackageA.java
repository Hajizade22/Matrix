package com.example.game;

public class PackageA {
    private int treasure=(int)( Math.random()*10)+1;

    public int money;

    public int getTreasure() {
        return treasure;
    }

    public void explore(){
        if (treasure>=5 )
            System.out.println("Tebrikler!!! Siz Xezineni tapdiniz");
        else  {
            System.out.println("Xezineni tapmadiniz");
        }
    }

}
