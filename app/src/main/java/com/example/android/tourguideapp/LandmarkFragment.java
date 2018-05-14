package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

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
        landmarkList.add(new Landmark("Shri Ambadevi Temple", "It's an ancient Hindu temple. Located in the heart of Amravati, Ambadevi temple is reckoned as one of the oldest temples of the region. The principal deity of the temple is Goddess Ambadevi, incarnations of goddess Durga. According to historical records, Krishna got married to her in Ambadevi temple.",R.drawable.ambadevi_temple_1));
        landmarkList.add(new Landmark("Maltekdi", "Maltekdi is a beautiful hilltop in the central of Amravati city . This place is best for morning/evening walk, having a slant height due to hill. We will have a clear & beutiful view of the city from a hill top with fresh air. It has play equipments for childrens as well as free gymnasium equipments for adults for both male & female. It is place for rejoice & excercise", R.drawable.maltekadi));
        landmarkList.add(new Landmark("HVPM", "Hanuman Vyayam Prasarak Mandal (HVPM) is a premier institute in India in physical training. It was set up by Mr Anant Vaidya and Mr Ambadas Vaidya around 1914. Earlier it was referred as Hanuman Akhada.", R.drawable.hvpm));
        landmarkList.add(new Landmark("Amravati University", "The university was established on 1 May 1983. The university campus is spread over an area of 225 hectares, and the university is home to 20 post-graduate departments offering 25 courses in different disciplines.", R.drawable.amravati_university));

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
