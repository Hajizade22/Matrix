package Lesson_13;

import java.util.Objects;

public class HomeWork1 {
    String ad;
    String soyad;
    String ataadi;
    String dogumtarixi;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeWork1 homeWork1 = (HomeWork1) o;
        return dogumtarixi == homeWork1.dogumtarixi && Objects.equals(ad, homeWork1.ad) && Objects.equals(soyad, homeWork1.soyad) && Objects.equals(ataadi, homeWork1.ataadi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ad, soyad, ataadi, dogumtarixi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAtaadi() {
        return ataadi;
    }

    public void setAtaadi(String ataadi) {
        this.ataadi = ataadi;
    }

    public String getDogumtarixi() {
        return dogumtarixi;
    }

    public void setDogumtarixi(String dogumtarixi) {
        this.dogumtarixi = dogumtarixi;
    }

    public HomeWork1(String ad, String soyad, String ataadi, String dogumtarixi) {
        this.ad = ad;
        this.soyad = soyad;
        this.ataadi = ataadi;
        this.dogumtarixi = dogumtarixi;
    }
}
    class insan extends HomeWork1{
    String isyeri;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            insan insan = (insan) o;
            return Objects.equals(isyeri, insan.isyeri);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), isyeri);
        }

        public String getIsyeri() {
            return isyeri;
        }

        public void setIsyeri(String isyeri) {
            this.isyeri = isyeri;
        }

        @Override
        public String toString() {
            return
                    " Ad " + ad +
                    ", Soyad " + soyad +
                    ", Ata adi " + ataadi +
                    ", Doğum tarixi " + dogumtarixi+
                    " İş yeri " + isyeri ;

        }

        public insan(String ad, String soyad, String ataadi, String dogumtarixi, String isyeri) {
            super(ad, soyad, ataadi, dogumtarixi);
            this.isyeri = isyeri;
        }
    }
    class print{
        public static void main(String[] args) {
            insan ins=new insan("Yusif","Hacizade","Haci","22.08.2022","yoxdur" );
            insan ins1=new insan("Yusif","Hacizade","Haci","22.08.2022","yoxdur");
            insan ins2=ins;
            System.out.println(ins.equals(ins1));
            System.out.println(ins==ins1);
            System.out.println(ins.equals(ins2));
            System.out.println(ins==ins2);
        }
    }
