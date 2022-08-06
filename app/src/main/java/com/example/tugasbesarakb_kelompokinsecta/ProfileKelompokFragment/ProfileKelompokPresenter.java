package com.example.tugasbesarakb_kelompokinsecta.ProfileKelompokFragment;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Muhammad Farhan
// Nim   : 10119264
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ridwan Ramadhan
// Nim   : 10119263
// Kelas : IF-7

public class ProfileKelompokPresenter {
    private ProfileKelompokView viewnya;
    private View view;

    public ProfileKelompokPresenter(View view) {
        this.viewnya = new ProfileKelompokView();
        this.view = view;
    }

    String getNamaTim() { return viewnya.getNamaTim(); }
    String getNamaAnggota1() { return viewnya.getNamaAnggota1(); }
    String getNamaAnggota2() { return viewnya.getNamaAnggota2(); }
    String getNamaAnggota3() { return viewnya.getNamaAnggota3(); }
    String getNamaAnggota4() { return viewnya.getNamaAnggota4(); }
    String getNimAnggota1()  { return viewnya.getNimAnggota1();  }
    String getNimAnggota2()  { return viewnya.getNimAnggota2();  }
    String getNimAnggota3()  { return viewnya.getNimAnggota3();  }
    String getNimAnggota4()  { return viewnya.getNimAnggota4();  }

    public interface View{
        void HideTaskbar();
    }

}
