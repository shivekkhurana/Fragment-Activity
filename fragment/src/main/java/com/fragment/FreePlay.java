package com.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Divyanshu Srivastava on 7/26/14.
 */
public class FreePlay extends Fragment{



    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

       // View rootView = inflater.inflate(R.layout.free_play,container, false);

        return inflater.inflate(R.layout.free_play,container, false);


    }
}
