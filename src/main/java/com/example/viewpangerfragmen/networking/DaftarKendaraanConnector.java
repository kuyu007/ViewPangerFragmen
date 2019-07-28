package com.example.viewpangerfragmen.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DaftarKendaraanConnector {

    private static final String BASE_URL = "https://api.myjson.com/bins/";

    public static DaftarKendaraanServices getClient(){

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DaftarKendaraanServices.class);

    }

}
