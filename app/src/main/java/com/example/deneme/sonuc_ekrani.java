package com.example.deneme;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class sonuc_ekrani extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

      View tasarim = inflater.inflate(R.layout.fragment_sonuc_ekrani, container, false);
        return  tasarim;
    }
}