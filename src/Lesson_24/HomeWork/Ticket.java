package Lesson_24.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {
    private static int biletSayi = 0;
    private int biletID;
    private String basliq;
    private String aciqlama;
    private String status;
    private String prioritet;

    public Ticket(String basliq, String aciqlama, String prioritet) {
        this.biletID = ++biletSayi;
        this.basliq = basliq;
        this.aciqlama = aciqlama;
        this.status = "Açıq";
        this.prioritet = prioritet;
    }

    public int getBiletID() {
        return biletID;
    }

    public String getBasliq() {
        return basliq;
    }

    public void setBasliq(String basliq) {
        this.basliq = basliq;
    }

    public String getAciqlama() {
        return aciqlama;
    }

    public void setAciqlama(String aciqlama) {
        this.aciqlama = aciqlama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioritet() {
        return prioritet;
    }

    public void setPrioritet(String prioritet) {
        this.prioritet = prioritet;
    }
}


