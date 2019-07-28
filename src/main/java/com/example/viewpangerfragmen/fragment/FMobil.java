package com.example.viewpangerfragmen.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpangerfragmen.adapter.DaftarMobilAdapter;
import com.example.viewpangerfragmen.model.DaftarMobilModel;
import com.example.viewpangerfragmen.R;

import java.util.ArrayList;


public class FMobil extends Fragment {

    RecyclerView rvMobil;
    DaftarMobilAdapter daftarMobilAdapter;

    String[] dataTitle = new String[]{
            "Mobil Vw Bandung",
            "Mobil Vw Jakarta",
            "Mobil Vw Surabaya",
            "Mobil Vw Yogyakarta"
    };
    String[] dataDescription = new String[]{
            "Ini merupakan mobil Vw Bandung classic tahun 1996",
            "Ini merupakan mobil Vw Jakarta classic tahun 1997",
            "Ini merupakan mobil Vw Surabaya classic tahun 1998",
            "Ini merupakan mobil Vw Yogyakarta classic tahun 1999"
    };
    int[] dataPrice = new  int[]{
            10000,
            20000,
            30000,
            40000
    };

    String[] dataImageString = new String[]{
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/1C4HJXFN2KW522656/7f5c690efc2b77676ce458d8d763d9fc.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2C3CCARG2KH565296/7faed2403cec7ebd2c83312335a65b39.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2C3CCAEG8JH324511/45025f6766d7cfa7507870d6a5f4d188.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/1C4PJMCX5JD507207/7f30d7d60eb9ad0d586723def9fdef2d.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2GNAXUEV3K6162590/1e5e547f4ef824c0f69340e88f289966.jpg"
    };
//    int[] dataImage = new int[]{
//            R.drawable.vw,
//            R.drawable.vw1,
//            R.drawable.vw2,
//            R.drawable.vw3
//    };

    public FMobil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fmobil, container, false);
        rvMobil = view.findViewById(R.id.rvMobil);
        rvMobil.setLayoutManager(new LinearLayoutManager(getActivity()));
        daftarMobilAdapter = new DaftarMobilAdapter(
                getActivity(),
                getListData());
        daftarMobilAdapter.notifyDataSetChanged();

        rvMobil.setAdapter(daftarMobilAdapter);
        return view;
    }

    public ArrayList<DaftarMobilModel> getListData() {
        ArrayList<DaftarMobilModel> daftarMobil = new ArrayList<>();
        for (int i = 0; i < dataTitle.length; i++){
            daftarMobil.add(new DaftarMobilModel(
                    i,
                    dataImageString[i],
                    dataTitle[i],
                    dataDescription[i],
                    dataPrice[i]
            ));
    }return daftarMobil;
    }


}
