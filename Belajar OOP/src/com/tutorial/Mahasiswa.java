package com.tutorial;

public class Mahasiswa extends Orangtua {
    String nama;
    String nim;


    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void showMhs(){
        System.out.println("Nama " + nama + "nim " + nim);
    }

    @Override
    void orangTua() {
        System.out.println("Orang tua mahasiswa");
        super.orangTua();
    }

    //    @Override
//    void makan() {
//        System.out.println("Makan pake tangan dan mulut");
//    }
//
//    @Override
//    void berjalan() {
//        System.out.println("Memakai dua kaki");
//    }
}
