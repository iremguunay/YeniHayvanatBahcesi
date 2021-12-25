package com.bilgeadam.yhb;

public class Calistir {

    /*public void seslendir(Kopek kopek) {
        kopek.sesCikar();
    }

    public void seslendir(Kedi kedi) {
        kedi.sesCikar();
    }*/

    public void seslendir(Hayvan hayvan) {
        hayvan.sesCikar();
    }


    public static void main(String[] args) {
        Calistir calistir = new Calistir();

        //Kopek kopek1 = new Kopek();

        //Polymorphism
        //Alt class objesini, üst class değişkeniyle oluşturma

        Hayvan kopek1 = new Kopek();
        kopek1.setNo(1);
        kopek1.setAd("Garip");
        kopek1.setAgirlik(30);
        kopek1.setUzunluk(1.5);

        System.out.println(kopek1);
        calistir.seslendir(kopek1);

        System.out.println("--------------");

        //Kedi kedi1 = new Kedi();
        Hayvan kedi1 = new Kedi();
        kedi1.setNo(2);
        kedi1.setAd("Sarman");
        kedi1.setAgirlik(5);
        kedi1.setUzunluk(0.4);

        System.out.println(kedi1);
        calistir.seslendir(kedi1);

        System.out.println("--------------");

        Hayvan esek1 = new Esek();
        esek1.setNo(3);
        esek1.setAd("Karakaçan");
        esek1.setAgirlik(110);
        esek1.setUzunluk(2.3);

        System.out.println(esek1);
        calistir.seslendir(esek1);
    }

}
