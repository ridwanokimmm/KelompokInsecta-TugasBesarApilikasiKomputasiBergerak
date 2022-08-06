package com.example.tugasbesarakb_kelompokinsecta.ClassSplashScreen;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Dafana Fikri
// Nim   : 10119275
// Kelas : IF-7

public class ClassSplashScreenPresenter {

    private View view;

    public ClassSplashScreenPresenter(View view) {
        this.view = view;
    }

    public interface View{
        void DoSplashscreen();
        void HideTaskbar();
    }

}
