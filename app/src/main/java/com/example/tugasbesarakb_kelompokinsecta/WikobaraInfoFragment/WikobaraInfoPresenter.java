package com.example.tugasbesarakb_kelompokinsecta.WikobaraInfoFragment;

import androidx.viewpager.widget.ViewPager;

import com.example.tugasbesarakb_kelompokinsecta.ClassViewPager.ClassViewPagerView;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ikhlasul Fadhillah
// Nim   : 10119254
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ridwan Ramadhan
// Nim   : 10119263
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Muhammad Farhan
// Nim   : 10119264
// Kelas : IF-7


public class WikobaraInfoPresenter {
    private ClassViewPagerView viewnya;
    private View view;

    public WikobaraInfoPresenter(View view) {
        this.viewnya = new ClassViewPagerView();
        this.view = view;
    }

    public void updateJudulPage1(String judul_page){ viewnya.setJudulPage1(judul_page); }
    public void updateJudulPage2(String judul_page){ viewnya.setJudulPage2(judul_page); }
    public void updateJudulPage3(String judul_page){ viewnya.setJudulPage3(judul_page); }
    public void updateDeskripsiPage1(String deskripsi_page){ viewnya.setDeskripsiPage1(deskripsi_page); }
    public void updateDeskripsiPage2(String deskripsi_page){ viewnya.setDeskripsiPage2(deskripsi_page); }
    public void updateDeskripsiPage3(String deskripsi_page){ viewnya.setDeskripsiPage3(deskripsi_page); }

    String getJudulPage1(){ return viewnya.getJudulPage1(); }
    String getJudulPage2(){ return viewnya.getJudulPage2(); }
    String getJudulPage3(){ return viewnya.getJudulPage3(); }
    String getDeskripsiPage1(){ return viewnya.getDeskripsiPage1(); }
    String getDeskripsiPage2(){ return viewnya.getDeskripsiPage2(); }
    String getDeskripsiPage3(){ return viewnya.getDeskripsiPage3(); }

    public interface View{
        void HideTaskbar();
        void ButtonListen();
        void InisialisasiVariable();
        void InisialisasiValueVariable();
        ViewPager.OnPageChangeListener ViewPager();
        void PanggilViewPager();
    }

}
