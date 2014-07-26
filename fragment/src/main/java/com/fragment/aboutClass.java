package com.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Divyanshu on 7/26/14.
 */
public class aboutClass extends Fragment {

    public aboutClass() {}

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.about_class,container, false);

        return rootView;


    }
}


