package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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


        final ArrayList<Landmark> landmarkList = new ArrayList<>();
        landmarkList.add(new Landmark(getString(R.string.ambadevi_temple), getString(R.string.ambadevi_temple_desc), R.drawable.ambadevi_temple_1));
        landmarkList.add(new Landmark(getString(R.string.maltekli), getString(R.string.maltekli_desc), R.drawable.maltekadi));
        landmarkList.add(new Landmark(getString(R.string.hvpm), getString(R.string.hvpm_desc), R.drawable.hvpm));
        landmarkList.add(new Landmark(getString(R.string.amravati_university), getString(R.string.amravati_university_desc), R.drawable.amravati_university));

        LandmarkListAdapter adapter = new LandmarkListAdapter(getContext(), landmarkList);
        ListView landmarkListView = (ListView) view.findViewById(R.id.landmarkListView);
        landmarkListView.setAdapter(adapter);

        landmarkListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra(Constants.SELECTED_LANDMARK, landmarkList.get(i));
                startActivity(intent);
            }
        });

        return view;
    }
}
