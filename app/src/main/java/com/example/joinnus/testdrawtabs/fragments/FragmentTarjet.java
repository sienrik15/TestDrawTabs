package com.example.joinnus.testdrawtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joinnus.testdrawtabs.R;

/**
 * Created by joinnus on 02/05/17.
 */

public class FragmentTarjet extends Fragment {

    public FragmentTarjet(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tabs3, container, false);
        return rootView;
    }

}
