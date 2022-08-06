package com.example.tugasbesarakb_kelompokinsecta.ProfileKelompokFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugasbesarakb_kelompokinsecta.R;
import com.example.tugasbesarakb_kelompokinsecta.R;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ikhlasul Fadhillah
// Nim   : 10119254
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Muhammad Farhan
// Nim   : 10119264
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ridwan Ramadhan
// Nim   : 10119263
// Kelas : IF-7

public class ProfileKelompokFragment extends Fragment implements ProfileKelompokPresenter.View {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        HideTaskbar();
        return inflater.inflate(R.layout.profile_kelompok_fragment, container, false);
    }

    @Override
    public void HideTaskbar() {
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
}