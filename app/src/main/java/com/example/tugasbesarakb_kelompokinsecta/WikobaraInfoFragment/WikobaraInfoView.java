package com.example.tugasbesarakb_kelompokinsecta.WikobaraInfoFragment;

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

public class WikobaraInfoView {

    private String judul_page1 = "", judul_page2 = "", judul_page3 = "";
    private String deskripsi_page1 = "", deskripsi_page2 = "", deskripsi_page3 = "";

    public WikobaraInfoView() {}
    public WikobaraInfoView(String judul_page1, String judul_page2, String judul_page3,
                            String deskripsi_page1, String deskripsi_page2, String deskripsi_page3) {
        this.judul_page1 = judul_page1;
        this.judul_page2 = judul_page2;
        this.judul_page3 = judul_page3;
        this.deskripsi_page1 = deskripsi_page1;
        this.deskripsi_page2 = deskripsi_page2;
        this.deskripsi_page3 = deskripsi_page3;
    }

    public String getJudulPage1() { return judul_page1; }
    public String getJudulPage2() { return judul_page2; }
    public String getJudulPage3() { return judul_page3; }
    public String getDeskripsiPage1() { return deskripsi_page1; }
    public String getDeskripsiPage2() { return deskripsi_page2; }
    public String getDeskripsiPage3() { return deskripsi_page3; }

    public void setJudulPage1(String judul_page1) { this.judul_page1 = judul_page1; }
    public void setJudulPage2(String judul_page2) { this.judul_page2 = judul_page2; }
    public void setJudulPage3(String judul_page3) { this.judul_page3 = judul_page3; }
    public void setDeskripsiPage1(String deskripsi_page1) { this.deskripsi_page1 = deskripsi_page1; }
    public void setDeskripsiPage2(String deskripsi_page2) { this.deskripsi_page2 = deskripsi_page2; }
    public void setDeskripsiPage3(String deskripsi_page3) { this.deskripsi_page3 = deskripsi_page3; }

}
