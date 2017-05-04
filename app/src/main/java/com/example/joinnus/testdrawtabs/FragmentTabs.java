package com.example.joinnus.testdrawtabs;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joinnus.testdrawtabs.adapters.AdaptadorSecciones;
import com.example.joinnus.testdrawtabs.fragments.FragmentDirect;
import com.example.joinnus.testdrawtabs.fragments.FragmentPerfil;
import com.example.joinnus.testdrawtabs.fragments.FragmentTarjet;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTabs extends Fragment {

    private AppBarLayout appBar;
    private TabLayout pstañas;
    private  ViewPager viewPager;

    public FragmentTabs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs, container, false);
        /*Toolbar toolbar = (Toolbar) view.findViewById(R.id.barlayotu) ;
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);*/

        //ViewPager viewPager = (ViewPager) view.findViewById(R.id.conter);
        //TabLayout tabs = (TabLayout) view.findViewById(R.id.tabs1);

       // tabs.setupWithViewPager(viewPager);

        if (savedInstanceState == null) {

            insertarTabs(container);

            viewPager = (ViewPager) view.findViewById(R.id.conter_base);
            poblarViewPager(viewPager);

            pstañas.setupWithViewPager(viewPager);

        }

        return view;

    }

    private void insertarTabs(ViewGroup container) {
        View padre = (View) container.getParent();
        appBar = (AppBarLayout) padre.findViewById(R.id.appbar);
        pstañas = new TabLayout(getActivity());
        pstañas.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        appBar.addView(pstañas);
    }

    private void poblarViewPager(ViewPager viewPager) {
        AdaptadorSecciones adapter = new AdaptadorSecciones(getFragmentManager());
        adapter.addFragment(new FragmentPerfil(), "Perfil");
        adapter.addFragment(new FragmentDirect(), "Direction");
        adapter.addFragment(new FragmentTarjet(), "tarjeta");
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);//mantiene numero de Tabs con sus fragmentos sin eliminarce y refrescar
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        appBar.removeView(pstañas);
    }



}
