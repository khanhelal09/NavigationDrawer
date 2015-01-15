package com.example.android.navigationdrawerexample.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.navigationdrawerexample.R;

/**
 * A dummy fragment representing a section of the app, but that simply displays dummy text.
 */
public  class FragmentB extends Fragment {

    public static final String ARG_SECTION_NUMBER = "section_number";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_section_dummy, container, false);
        Bundle args = getArguments();
       
       ((TextView) rootView.findViewById(android.R.id.text1)).setText("This is Tab B");
        
        return rootView;
    }
}
