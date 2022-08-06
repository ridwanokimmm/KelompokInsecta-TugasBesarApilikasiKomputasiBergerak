package com.example.tugasbesarakb_kelompokinsecta.ClassSplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasbesarakb_kelompokinsecta.ClassViewPager.ClassViewPager;
import com.example.tugasbesarakb_kelompokinsecta.R;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Muhammad Farhan
// Nim   : 10119264
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Dafana Fikri
// Nim   : 10119275
// Kelas : IF-7

public class ClassSplashScreen extends AppCompatActivity implements ClassSplashScreenPresenter.View {

    private ClassSplashScreenPresenter presenter;
    String class_awal = "", class_tujuan = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_splash_screen);
        presenter = new ClassSplashScreenPresenter(this);
        HideTaskbar();
        DoSplashscreen();
    }

    @Override
    public void HideTaskbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void DoSplashscreen() {
        int SPLASH_DISPLAY_LENGTH = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(ClassSplashScreen.this, ClassViewPager.class);
                ClassSplashScreen.this.startActivity(mainIntent);
                ClassSplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}