package com.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Divyanshu Srivastava on 7/26/14.
 */
public class controlFragment extends Fragment {

    public controlFragment() {}

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
    Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.control_fragment, container, false);

        return rootView;


    }









}
