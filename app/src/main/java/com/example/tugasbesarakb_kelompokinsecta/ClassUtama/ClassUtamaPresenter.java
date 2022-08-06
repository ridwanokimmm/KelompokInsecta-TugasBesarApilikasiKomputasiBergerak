package com.example.tugasbesarakb_kelompokinsecta.ClassUtama;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ikhlasul Fadhillah
// Nim   : 10119254
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Muhammad Farhan
// Nim   : 10119264
// Kelas : IF-7

public class ClassUtamaPresenter {

    private View view;

    public ClassUtamaPresenter(View view) {
        this.view = view;
    }

    public interface View{
        void HideTaskbar();
    }
}
