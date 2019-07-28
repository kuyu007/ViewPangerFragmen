package com.example.viewpangerfragmen.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpangerfragmen.R;
import com.example.viewpangerfragmen.adapter.DaftarMobilAdapter;
import com.example.viewpangerfragmen.adapter.DaftarMotorAdafter;
import com.example.viewpangerfragmen.model.DaftarMobilModel;
import com.example.viewpangerfragmen.model.DaftarMotorModel;
import com.example.viewpangerfragmen.networking.DaftarKendaraanConnector;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class FPesawat extends Fragment {

    RecyclerView rvPesawat;
    DaftarMobilAdapter daftarMobilAdapter;

    public FPesawat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fpesawat, container, false);
        rvPesawat = view.findViewById(R.id.rvPesawat);
        rvPesawat.setLayoutManager(new LinearLayoutManager(getActivity()));

        getDataPesawatAPI();
        DaftarMobilModel daftarMobilModel;
        return view;
    }

    private void getDataPesawatAPI() {

        DaftarKendaraanConnector.getClient().getDaftarMotor().enqueue(new Callback<ArrayList<DaftarMobilModel>>() {
            @Override
            public void onResponse(Call<ArrayList<DaftarMobilModel>> call, Response<ArrayList<DaftarMobilModel>> response) {
                daftarMobilAdapter = new DaftarMobilAdapter(
                        getActivity(),
                        response.body()
                );

                daftarMobilAdapter.notifyDataSetChanged();
                rvPesawat.setAdapter(daftarMobilAdapter);
            }

            @Override
            public void onFailure(Call<ArrayList<DaftarMobilModel>> call, Throwable t) {

            }
        });
    }

}
