package com.example.tugasbesarakb_kelompokinsecta.ClassViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.tugasbesarakb_kelompokinsecta.ClassUtama.ClassUtama;
import com.example.tugasbesarakb_kelompokinsecta.R;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ridwan Ramadhan
// Nim   : 10119263
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ikhlasul Fadhillah
// Nim   : 10119254
// Kelas : IF-7


public class ClassViewPager extends AppCompatActivity implements ClassViewPagerPresenter.View {

    ViewPager viewPager;
    Button btnNext;
    int[] layouts;
    ViewPagerAdapter adapter;
    private ClassViewPagerPresenter presenter;
    private TextView JudulPage;
    private TextView DeskripsiPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_view_pager);
        HideTaskbar();
        InisialisasiVariable();
        InisialisasiValueVariable(); // Method untuk mengubah text pada Onboard
        ButtonListen();
        PanggilViewPager();
    }

    @Override
    public void HideTaskbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void ButtonListen() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            Handler h = new Handler();
            @Override
            public void onClick(View v) {
                if(viewPager.getCurrentItem() + 1 < layouts.length){
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                } else {
                    h.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(ClassViewPager.this, ClassUtama.class);
                            startActivity(i);
                            finish();
                        }
                    }, 2000);
                }
            }
        });
    }

    public void InisialisasiVariable() {
        presenter = new ClassViewPagerPresenter(this);
        viewPager = findViewById(R.id.pager);
        btnNext = findViewById(R.id.nextBtn);
        JudulPage = findViewById(R.id.JudulPage);
        DeskripsiPage = findViewById(R.id.DeskripsiPage);
        layouts = new int[] {
                R.layout.slide1,
                R.layout.slide2,
                R.layout.slide3
        };
        adapter = new ViewPagerAdapter(this, layouts);
        viewPager.setAdapter(adapter);
    }

    public void InisialisasiValueVariable() {
        //Inisialisasi Judul dan Deskripsi pada onboard
        presenter.updateJudulPage1("Telusuri Wisata");
        presenter.updateDeskripsiPage1("Melihat berbagai tempat wisata \n dalam satu apilikasi");
        presenter.updateJudulPage2("Mudah Digunakan");
        presenter.updateDeskripsiPage2("Mudahnya penggunaan apilikasi \n dengan tampilan yang responsive");
        presenter.updateJudulPage3("Melihat Detail Wisata");
        presenter.updateDeskripsiPage3("Menampilkan photo lokasi\n wisata dengan detail");

        JudulPage.setText(presenter.getJudulPage1());
        DeskripsiPage.setText(presenter.getDeskripsiPage1());
    }

    public ViewPager.OnPageChangeListener ViewPager() {
        ViewPager.OnPageChangeListener viewPagerChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int il) {

            }

            @Override
            public void onPageSelected(int i) {
                //JudulPage1.setText("tesss");
                if(i == layouts.length - 1){
                    JudulPage.setText(presenter.getJudulPage3());
                    DeskripsiPage.setText(presenter.getDeskripsiPage3());
                    btnNext.setText("Continue");
                } else {
                    JudulPage.setText(presenter.getJudulPage2());
                    DeskripsiPage.setText(presenter.getDeskripsiPage2());
                    btnNext.setText("Next");
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };
        return viewPagerChangeListener;
    }

    public void PanggilViewPager() {
        viewPager.addOnPageChangeListener(ViewPager());
    }

}