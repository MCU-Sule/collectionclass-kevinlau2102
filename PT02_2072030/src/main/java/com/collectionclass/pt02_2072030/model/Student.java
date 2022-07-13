package com.collectionclass.pt02_2072030.model;

public class Student {
    private int nrp;
    private String nama;
    public Student(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
