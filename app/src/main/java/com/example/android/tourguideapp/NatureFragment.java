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

public class NatureFragment extends Fragment {
    View view;

    public NatureFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.nature_fragment, container, false);

        final ArrayList<Landmark> landmarkList = new ArrayList<>();
        landmarkList.add(new Landmark(getString(R.string.melghat), getString(R.string.melghat_desc), R.drawable.melghat_tiger_reserve));
        landmarkList.add(new Landmark(getString(R.string.fort), getString(R.string.fort_desc), R.drawable.gavilgarh_fort));
        landmarkList.add(new Landmark(getString(R.string.bamboo_garden), getString(R.string.bamboo_garden_desc), R.drawable.bamboo_garden));
        landmarkList.add(new Landmark(getString(R.string.upper_wardha_dam), getString(R.string.upper_wardha_dam_desc), R.drawable.upper_wardha_dam));
        landmarkList.add(new Landmark(getString(R.string.wadali_talao), getString(R.string.wadali_talao_desc), R.drawable.wadali_lake_garden));

        NatureListAdapter adapter = new NatureListAdapter(getContext(), landmarkList);
        ListView natureListView = (ListView) view.findViewById(R.id.natureListView);
        natureListView.setAdapter(adapter);

        natureListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
