package com.example.restaurantbooking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Menu_Fragment extends Fragment implements View.OnClickListener {


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate (R.layout.menu_item , container,false );
        ((home)getActivity()).loadMenu();
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
