package com.rndflo.mobile.android.gophrit.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rndflo.mobile.android.gophrit.R;


/**
 * Created by das on 13/06/17.
 */
public class CooperHomeManageFragment extends Fragment {
    private TextView vToolbarTitle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_manage_cooper_home, null);
        // ANDROID-813 vToolbarTitle = (TextView) view.findViewById(R.id.toolbar_title);
        // ANDROID-813 vToolbarTitle.setText(Constants.MIFI_TAB_MORE_TITLE);
        return view;
    }
}
