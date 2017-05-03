package com.example.joinnus.testdrawtabs;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

/**
 * Created by joinnus on 28/04/17.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter{

    //SUper
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        switch (position) {
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "TODOS";
            case 1:
                return "HOY";
            case 3:
                return "MAÑANA";
        }
        return null;
    }
}
