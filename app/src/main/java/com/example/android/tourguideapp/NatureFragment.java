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
        landmarkList.add(new Landmark("MelGhat Tiger Reserve","Melghat tiger reserve is great place to visit and have a close encounter with nature with beautiful roads and pleasant wether with variety of animals u can also visit a hill station chikhaldara to enjoy sunsets and beautiful whether.", R.drawable.melghat_tiger_reserve));
        landmarkList.add(new Landmark("Gavilgarh Fort","Gawilgadh Fort is situated at Chikhaldara hill station. Fort built in 1200 century went in the hands of Mughals for 260 years and then with British.It is property maintained by archeological serve Department of India. This fort have very large area and its internal planing is a good sample of security measures that time was taken. There is a palace and a tank inside. It's a good place to visit.", R.drawable.gavilgarh_fort));
        landmarkList.add(new Landmark("Bamboo Garden","This is first 'bamboo garden' of india in Amravati City. Amaravati residents will enjoy touring in this bamboo forest and this garden.Maharashtra is the highest bamboo growing State and its largest and most famous bamboo nursery is known as Vadali. Vadali lake and nearby areas with hillocks are located at a small distance from Amaravati city and this is a forest area. It is where Vadali bamboo nursery is located.", R.drawable.bamboo_garden));
        landmarkList.add(new Landmark("Upper Wardha Dam","This dam is located at Simbhora village near Morshi. It's approximately 60 km away from Amravati. It's major dam and lifeline of Amravati. It is mostly visited by peoples during rainy season and specially when its overflowing.", R.drawable.upper_wardha_dam));
        landmarkList.add(new Landmark("Wadali Talao","Wadali lake garden or Wadali talao is the only place in Amravati city where one can spend time with family and kids. This place is well connected with roads and its not far from city or almost in the city and one can go by autoriksha and bus.", R.drawable.wadali_lake_garden));

        NatureListAdapter adapter = new NatureListAdapter(getContext(), landmarkList);
        ListView natureListView = (ListView) view.findViewById(R.id.natureListView);
        natureListView.setAdapter(adapter);
        return view;
    }
}
