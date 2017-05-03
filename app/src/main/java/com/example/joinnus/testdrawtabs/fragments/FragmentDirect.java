package com.example.joinnus.testdrawtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joinnus.testdrawtabs.R;
import com.example.joinnus.testdrawtabs.adapters.AdapterDirect;

/**
 * Created by joinnus on 02/05/17.
 */

public class FragmentDirect extends Fragment{


    private LinearLayoutManager linearLayoutManager;

    public FragmentDirect(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //tabs2 es in layout con RecyclerView este se usara para varios fragmentos
        View view = inflater.inflate(R.layout.tabs2, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.reciclador);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterDirect adapterDirect = new AdapterDirect();
        recyclerView.setAdapter(adapterDirect);

        return view;


    }
}

