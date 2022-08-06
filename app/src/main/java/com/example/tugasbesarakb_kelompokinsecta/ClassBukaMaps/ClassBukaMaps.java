package com.example.tugasbesarakb_kelompokinsecta.ClassBukaMaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tugasbesarakb_kelompokinsecta.ClassUtama.ClassUtama;
import com.example.tugasbesarakb_kelompokinsecta.R;
import com.example.tugasbesarakb_kelompokinsecta.WikobaraMainFragment.WikobaraMainFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ridwan Ramadhan
// Nim   : 10119263
// Kelas : IF-7

public class ClassBukaMaps extends AppCompatActivity implements OnMapReadyCallback {

    TextView koordinat, NamaWisatanya, AlamatWisatanya;
    private double latituder, longituder;
    private String wisatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_buka_maps);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent myIntent = getIntent();
        String latitude = myIntent.getStringExtra("latitude");
        String longitude= myIntent.getStringExtra("longitude");
        String namawisata = myIntent.getStringExtra("namawisata");
        String alamat = myIntent.getStringExtra("alamat");

        latituder = Double.parseDouble(myIntent.getStringExtra("latitude"));
        longituder = Double.parseDouble(myIntent.getStringExtra("longitude"));
        wisatan = myIntent.getStringExtra("namawisata");

        NamaWisatanya = findViewById(R.id.NamaWisatanya);
        AlamatWisatanya = findViewById(R.id.AlamatWisatanya);
        koordinat = findViewById(R.id.koordinat);

        NamaWisatanya.setText(namawisata);
        AlamatWisatanya.setText(alamat);
        koordinat.setText("Lat: " + latitude + " \nLong: " + longitude);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_map);
        mapFragment.getMapAsync(this);

        Button fab = (Button) findViewById(R.id.ButtonKembali);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClassBukaMaps.this, ClassUtama.class));
            }
        });

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        float zoomLevel = 16.0f;
        LatLng koordinat = new LatLng(latituder, longituder);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(koordinat, zoomLevel));
        googleMap.addMarker(new MarkerOptions()
                .position(koordinat)
                .title("Wisata " + wisatan));
    }
}