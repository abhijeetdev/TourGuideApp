package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by abhijeetb on 14/05/2018.
 */

public class NatureFragment extends Fragment {
    View view;

    public NatureFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.nature_fragment, container, false);

        ArrayList<Landmark> landmarkList = new ArrayList<>();
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());

        NatureListAdapter adapter = new NatureListAdapter(getContext(), landmarkList);
        ListView natureListView = (ListView) view.findViewById(R.id.natureListView);
        natureListView.setAdapter(adapter);
        return view;
    }
}
