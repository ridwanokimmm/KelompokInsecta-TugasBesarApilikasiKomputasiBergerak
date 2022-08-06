package com.example.tugasbesarakb_kelompokinsecta.WikobaraMainFragment;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasbesarakb_kelompokinsecta.ClassBukaMaps.ClassBukaMaps;
import com.example.tugasbesarakb_kelompokinsecta.ClassViewPager.ClassViewPager;
import com.example.tugasbesarakb_kelompokinsecta.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

// Tanggal Pengerjaan 06-Agustus-2022
// Nama  : Ridwan Ramadhan
// Nim   : 10119263
// Kelas : IF-7

public class AdapterWisata extends RecyclerView.Adapter<AdapterWisata.MyViewHolder>{
    Context context;

    ArrayList<DataWisata> list;
    public ImageView gambar;


    public AdapterWisata(Context context, ArrayList<DataWisata> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        DataWisata user = list.get(position);
        holder.namawisata.setText(user.getNamaWisata());
        holder.asalwisata.setText(user.getAsalWisata());
        holder.latitude.setText(user.getLatitude());
        holder.longitude.setText(user.getLongitude());
        holder.alamat.setText(user.getAlamat());
        Picasso.with(context).load(user.getUrlPhoto()).into(holder.gambar);
        holder.bukamaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ClassBukaMaps.class);
                intent.putExtra("latitude",user.getLatitude());
                intent.putExtra("longitude",user.getLongitude());
                intent.putExtra("latitude",user.getLatitude());
                intent.putExtra("namawisata",user.getNamaWisata());
                intent.putExtra("alamat",user.getAlamat());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namawisata, latitude, longitude, alamat, asalwisata;
        ImageView gambar;
        Button bukamaps;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            namawisata = itemView.findViewById(R.id.NamaWisata);
            latitude = itemView.findViewById(R.id.Latitude);
            longitude = itemView.findViewById(R.id.Longitude);
            alamat = itemView.findViewById(R.id.Alamat);
            asalwisata = itemView.findViewById(R.id.KotaWisata);
            gambar = itemView.findViewById(R.id.gambar);
            bukamaps = itemView.findViewById(R.id.bukamaps);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("demo", "onclick :");
                }
            });

            itemView.findViewById(R.id.bukamaps).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("demo", "onclick :");
                }
            });

        }
    }

}
