package com.ffl.systra.Fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by PJS on 11/14/2017.
 */

public class AdapterSystraFragment extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private Context context;
    public AdapterSystraFragment(FragmentManager fm,Context context)
    {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return ProducteurFragment.newInstance(position);
            case 1:
                return ParcelleFragment.newInstance(position);
            default:
                return  null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Producteur";
            case 1:
                return "Parcelle";
        }
        return null;
    }
}
