package com.example.viewpangerfragmen.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpangerfragmen.activity.DetailActivity;
import com.example.viewpangerfragmen.model.DaftarMobilModel;
import com.example.viewpangerfragmen.R;

import java.util.ArrayList;

public class DaftarMobilAdapter extends
        RecyclerView.Adapter<DaftarMobilAdapter.ViewHolder> {
        Context context;
        ArrayList<DaftarMobilModel> dataMobil;

    public DaftarMobilAdapter(Context context, ArrayList<DaftarMobilModel> dataMobil) {
        this.context = context;
        this.dataMobil = dataMobil;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
       View view = LayoutInflater.from(context)
               .inflate(R.layout.item_dafatar_mobil, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(dataMobil.get(position));

    }

    @Override
    public int getItemCount() {
        return dataMobil.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivMobil;
        TextView tvTitle, tvDesc, tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivMobil = itemView.findViewById(R.id.mobil);
            tvTitle = itemView.findViewById(R.id.title);
            tvDesc = itemView.findViewById(R.id.desc);
            tvPrice = itemView.findViewById(R.id.price);


        }

        public ViewHolder(@NonNull View itemView, ImageView ivMobil, TextView tvTitle, TextView tvDesc, TextView tvPrice) {
            super(itemView);
            this.ivMobil = ivMobil;
            this.tvTitle = tvTitle;
            this.tvDesc = tvDesc;
            this.tvPrice = tvPrice;
        }

        public void setData(final DaftarMobilModel data){
            tvTitle.setText(data.getTitle());
            tvDesc.setText(data.getDescription());
            tvPrice.setText("Rp. " +data.getPrice());
                                                                                                    //String.valueOf(data.getPrice()[cara kedua untuk menampilkan data dari recycleview]
                                                                                                    //Cara Pertama harus intiger
                                                                                                    //ivMobil.setImageResource(data.getImage());
                                                                                                    //Cara Kedua(Dengan Glide) Rekomendasi karena bisa ngerisize gambar yang akan digunakan
                                                                                                    //int dan string
            Glide.with(itemView).load(data.getImage()).into(ivMobil);

            itemView.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   // Toast.makeText(context, "title" + data.getTitle(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context , DetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(DetailActivity.KEY_KENDARAAN, data);
                    intent.putExtras(bundle);


                    context.startActivity(intent);
                }

            }));
        }
    }
}
