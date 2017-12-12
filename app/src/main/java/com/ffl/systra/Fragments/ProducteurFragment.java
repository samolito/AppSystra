package com.ffl.systra.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.ffl.systra.R;

import java.util.ArrayList;

/**
 * Created by PJS on 11/14/2017.
 */

public class ProducteurFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private LinearLayout mLayout,mLayoutremove;
    private EditText mEditText;
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lvItems;
    //private Button mbtnremove;
    private int mPage;
    public static ProducteurFragment newInstance(int page)
    {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        ProducteurFragment fragment = new ProducteurFragment();
        fragment.setArguments(args);
        return  fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_producteur,container,false);
        setHasOptionsMenu(true);
        return view;
    }


}

