package com.example.viewpangerfragmen.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpangerfragmen.adapter.DaftarMobilAdapter;
import com.example.viewpangerfragmen.adapter.DaftarMotorAdafter;
import com.example.viewpangerfragmen.model.DaftarMobilModel;
import com.example.viewpangerfragmen.model.DaftarMotorModel;
import com.example.viewpangerfragmen.R;
import com.example.viewpangerfragmen.networking.DaftarKendaraanConnector;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FMotor extends Fragment {


    RecyclerView rvMotor;
    DaftarMobilAdapter daftarMobilAdapter;



//    String[] dataTitle = new String[]{
//            "Motor1",
//            "Motor2",
//            "Motor3",
//            "Motor4"
//    };
//    String[] dataDescription = new String[]{
//            "Ini merupakan motor1 klasik keren dan murah",
//            "Ini merupakan motor2 klasik keren dan murah",
//            "Ini merupakan motor3 klasik keren dan murah",
//            "Ini merupakan motor4 klasik keren dan murah"
//    };
//
//    int[] dataPrice = new   int[]{
//            100000,
//            200000,
//            300000,
//            400000
//    };
//    String[] dataImageString = new String[]{
//            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/1C4HJXFN2KW522656/7f5c690efc2b77676ce458d8d763d9fc.jpg",
//            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2C3CCARG2KH565296/7faed2403cec7ebd2c83312335a65b39.jpg",
//            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2C3CCAEG8JH324511/45025f6766d7cfa7507870d6a5f4d188.jpg",
//            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/1C4PJMCX5JD507207/7f30d7d60eb9ad0d586723def9fdef2d.jpg",
//            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2GNAXUEV3K6162590/1e5e547f4ef824c0f69340e88f289966.jpg"
//    };



    public FMotor(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fmotor, container, false);
        rvMotor = view.findViewById(R.id.rvMotor);
        rvMotor.setLayoutManager(new LinearLayoutManager(getActivity()));

//        daftarMobilAdapter.notifyDataSetChanged();
//        rvMotor.setAdapter(daftarMobilAdapter);

        getDaftarMotorAPI();
        DaftarMobilModel daftarMobilModel;
        return view;
    }

    private void getDaftarMotorAPI() {
        DaftarKendaraanConnector.getClient().getDaftarPesawat().enqueue(new Callback<ArrayList<DaftarMobilModel>>() {
            @Override
            public void onResponse(Call<ArrayList<DaftarMobilModel>> call, Response<ArrayList<DaftarMobilModel>> response) {
               daftarMobilAdapter = new DaftarMobilAdapter(
                getActivity(),
                response.body()
               );



                daftarMobilAdapter.notifyDataSetChanged();
                rvMotor.setAdapter(daftarMobilAdapter);
            }


            @Override
            public void onFailure(Call<ArrayList<DaftarMobilModel>> call, Throwable t) {

            }
        });
    }


//    public ArrayList<DaftarMotorModel> getListData() {
//        ArrayList<DaftarMotorModel> daftarMotor = new ArrayList<>();
//        for (int i = 0; i < dataTitle.length; i++){
//            daftarMotor.add(new DaftarMotorModel(
//                    i,
//                    dataImageString[i],
//                    dataTitle[i],
//                    dataDescription[i],
//                    dataPrice[i]
//            ));
//        }
//        return daftarMotor;
    }

