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
import com.example.viewpangerfragmen.model.DaftarMotorModel;
import com.example.viewpangerfragmen.R;

import java.util.ArrayList;

public class DaftarMotorAdafter {

}
//        RecyclerView.Adapter<DaftarMotorAdafter.ViewHolder> {
//        Context context;
//        ArrayList<DaftarMotorModel> dataMotor;
//    public DaftarMotorAdafter(Context context,ArrayList<DaftarMotorModel> dataMotor) {
//        this.context = context;
//        this.dataMotor = dataMotor;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context)
//                .inflate(R.layout.item_daftar_motor, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.setData(dataMotor.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return dataMotor.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder{
//
//        ImageView ivImage;
//        TextView tvTitle, tvDes, tvPrice;
//
//        public ViewHolder(View itemView){
//            super(itemView);
//
//            ivImage = itemView.findViewById(R.id.motor);
//            tvTitle = itemView.findViewById(R.id.title);
//            tvDes = itemView.findViewById(R.id.desc);
//            tvPrice = itemView.findViewById(R.id.price);
//
//        }
//
//        public void setData(final DaftarMotorModel data){
//            tvTitle.setText(data.dataTitle());
//            tvDes.setText(data.getDescription());
//            tvPrice.setText("Rp. "+data.getPrice());
//            Glide.with(itemView).load(data.getImage()).into(ivImage);
//
////            itemView.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    Toast.makeText(context, "Title" + data.getTitle(), Toast.LENGTH_SHORT).show();
//
////                    Intent intent = new Intent(context , DetailActivity.class);
////                    Bundle bundle = new Bundle();
////                    bundle.putParcelable(DetailActivity.KEY_KENDARAAN, data);
////                    intent.putExtras(bundle);
//
//
////                    context.startActivity(intent);
//                }
//            };
//        }







