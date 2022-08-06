package com.example.tugasbesarakb_kelompokinsecta.ClassUtama;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugasbesarakb_kelompokinsecta.ProfileKelompokFragment.ProfileKelompokFragment;
import com.example.tugasbesarakb_kelompokinsecta.R;
import com.example.tugasbesarakb_kelompokinsecta.WikobaraInfoFragment.WikobaraInfoFragment;
import com.example.tugasbesarakb_kelompokinsecta.WikobaraMainFragment.WikobaraMainFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ikhlasul Fadhillah
// Nim   : 10119254
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Muhammad Farhan
// Nim   : 10119264
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Dafana Fikri
// Nim   : 10119275
// Kelas : IF-7

public class ClassUtama extends AppCompatActivity implements ClassUtamaPresenter.View {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_utama);
        bottomNavigation = findViewById(R.id.bottom_navigation);

        //seleksi pertama kali aplikasi dijalankan
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WikobaraMainFragment()).commit();
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.profile:
                        selectedFragment = new WikobaraMainFragment();
                        break;
                    case R.id.home:
                        selectedFragment = new ProfileKelompokFragment();
                        break;
                    case R.id.about:
                        selectedFragment = new WikobaraInfoFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                return true;
            }
        });
    }


    @Override
    public void HideTaskbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}