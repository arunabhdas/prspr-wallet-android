package com.rndflo.mobile.android.gophrit.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rndflo.mobile.android.gophrit.R;


/**
 * Created by das on 13/07/17.
 */
public class CooperUsageMonthFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_mifi_usage_month, null);
        return view;
    }
}
