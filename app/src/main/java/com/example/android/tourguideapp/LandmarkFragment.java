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

public class LandmarkFragment extends Fragment {
   View view;

    public LandmarkFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.landmark_fragment, container, false);

        ArrayList<Landmark> landmarkList = new ArrayList<>();
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());

        LandmarkListAdapter adapter = new LandmarkListAdapter(getContext(), landmarkList);
        ListView landmarkListView = (ListView) view.findViewById(R.id.landmarkListView);
        landmarkListView.setAdapter(adapter);

        return view;



    }
}
