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
 * Created by abhi on 15/06/18.
 */

public class FestivalsFragment extends Fragment {
    View view;

    public FestivalsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.landmark_fragment, container, false);


        final ArrayList<Landmark> landmarkList = new ArrayList<>();

        landmarkList.add(new Landmark(getString(R.string.navratri), getString(R.string.navratri_desc), R.drawable.navratri));
        landmarkList.add(new Landmark(getString(R.string.ganesh_chaturth), getString(R.string.ganesh_chaturthi_desc), R.drawable.ganesha));
        landmarkList.add(new Landmark(getString(R.string.holi), getString(R.string.holi_desc), R.drawable.holi));
        landmarkList.add(new Landmark(getString(R.string.raksha_bandhan), getString(R.string.raksha_bandhan_desc), R.drawable.rakshabandhan));

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
