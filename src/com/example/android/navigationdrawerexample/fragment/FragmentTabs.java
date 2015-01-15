package com.example.android.navigationdrawerexample.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.navigationdrawerexample.R;

public class FragmentTabs extends Fragment {
	private FragmentTabHost mTabHost;

	// Mandatory Constructor according to support libs
	public FragmentTabs() {
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_tab, container,
				false);

		mTabHost = (FragmentTabHost) rootView
				.findViewById(android.R.id.tabhost);
		mTabHost.setup(getActivity(), getChildFragmentManager(),
				R.id.realtabcontent);

		mTabHost.addTab(
				mTabHost.newTabSpec("fragmentb").setIndicator("Fragment A"),
				FragmentA.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("fragmentc").setIndicator("Fragment B"),
				FragmentB.class, null);

		return rootView;
	}
	
	
	  @Override
	    public void onDestroyView() {
	        super.onDestroyView();
	        mTabHost = null;
	    }
}