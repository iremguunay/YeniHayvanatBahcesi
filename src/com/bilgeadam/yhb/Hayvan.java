package com.bilgeadam.yhb;

public class Hayvan {

    private int no;
    private String ad;
    private double agirlik;
    private double uzunluk;

    public Hayvan() {
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "no=" + no +
                ", ad='" + ad + '\'' +
                ", agirlik=" + agirlik +
                ", uzunluk=" + uzunluk +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public void sesCikar() {
        System.out.println("------------");
    }
}
