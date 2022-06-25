package com.example.deneme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.zip.Inflater;


public class oyun_ekrani extends Fragment {
    private Inflater inflater;

    private Button buttonbitir;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani, container, false);

        buttonbitir = tasarim.findViewById(R.id.buttonbitir);
        buttonbitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_oyun_ekrani_to_sonuc_ekrani);

            }
        });

        return tasarim;

    }
}