package com.example.tugasbesarakb_kelompokinsecta.WikobaraMainFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasbesarakb_kelompokinsecta.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ikhlasul Fadhillah
// Nim   : 10119254
// Kelas : IF-7

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ridwan Ramadhan
// Nim   : 10119263
// Kelas : IF-7

public class WikobaraMainFragment extends Fragment{

    RecyclerView recyclerView;
    DatabaseReference database;
    AdapterWisata myAdapter;
    ArrayList<DataWisata> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
        View view = inflater.inflate(R.layout.wikobara_main_app, container, false);
        recyclerView = view.findViewById(R.id.userList);
        database = FirebaseDatabase.getInstance().getReference("WisataBandungRaya");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        list = new ArrayList<>();
        myAdapter = new AdapterWisata(view.getContext(),list);
        recyclerView.setAdapter(myAdapter);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()){

                    DataWisata user = dataSnapshot.getValue(DataWisata.class);
                    list.add(user);
                }
                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        return view;
    }

}