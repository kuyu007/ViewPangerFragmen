package com.example.viewpangerfragmen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.viewpangerfragmen.R;
import com.example.viewpangerfragmen.fragment.FMobil;
import com.example.viewpangerfragmen.fragment.FPesawat;
import com.example.viewpangerfragmen.model.DaftarMobilModel;
import com.example.viewpangerfragmen.model.DaftarMotorModel;

public class DetailActivity extends AppCompatActivity {

    TextView tvTitle, tvDesc, tvPrice;
    ImageView ivKendaraan;

    public  final static String KEY_KENDARAAN = "KEY_KENDARAAN";
    DaftarMobilModel daftarMobilModel;
    private Object FPesawat;

//    DaftarMotorModel daftarMotorModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.dtitle);
        tvDesc = findViewById(R.id.ddesc);
        tvPrice = findViewById(R.id.dprice);
        ivKendaraan = findViewById(R.id.dimage);

        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            daftarMobilModel = bundle.getParcelable(KEY_KENDARAAN);
        }
        if(daftarMobilModel !=null){
            tvTitle.setText(daftarMobilModel.getTitle());
            tvPrice.setText("Rp. "+daftarMobilModel.getPrice());
            tvDesc.setText(daftarMobilModel.getDescription());
            Glide.with(this)
                    .load(daftarMobilModel.getImage())
                    .into(ivKendaraan);
        }

//        if(bundle !=null){
//            daftarMotorModel = bundle.getParcelable(KEY_KENDARAAN);
//        }
//        if (daftarMotorModel != null){
//            tvTitle.setText(daftarMotorModel.getTitle());
//            tvPrice.setText("Rp. "+daftarMotorModel.getPrice());
//            tvDesc.setText(daftarMotorModel.getDescription());
//            Glide.with(this)
//                    .load(daftarMotorModel.getImage())
//                    .into(ivKendaraan);
//        }

        getSupportActionBar().setTitle("Pesawat");

    }
}
