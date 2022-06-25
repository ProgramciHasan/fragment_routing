package com.example.deneme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class anasayfa_fragment extends Fragment {
     private Button buttonbasla ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View tasarim=inflater.inflate(R.layout.fragment_anasayfa_fragment, container, false);

         buttonbasla = tasarim.findViewById(R.id.buttonbasla);

         buttonbasla.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Navigation.findNavController(v).navigate(R.id.oyun_ekranina_gecis);
             }
         });


        return tasarim;
    }
}