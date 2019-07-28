package com.example.viewpangerfragmen.networking;

import com.example.viewpangerfragmen.model.DaftarMobilModel;
import com.example.viewpangerfragmen.model.DaftarMotorModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DaftarKendaraanServices {
    @GET("nxhwn")
    Call<ArrayList<DaftarMobilModel>> getDaftarMotor();

    @GET ("pnnk7")
    Call<ArrayList<DaftarMobilModel>> getDaftarPesawat();


}
