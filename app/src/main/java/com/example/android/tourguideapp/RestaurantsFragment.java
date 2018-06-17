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

public class RestaurantsFragment extends Fragment {
    View view;

    public RestaurantsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.shopping_fragment, container, false);

        final ArrayList<Landmark> landmarkList = new ArrayList<>();
        landmarkList.add(new Landmark(getString(R.string.rajkamal_square), getString(R.string.rajkamal_square_desc), R.drawable.rajkalam_square));
        landmarkList.add(new Landmark(getString(R.string.spice_kitchen_hotel), getString(R.string.spice_kitchen_hotel_desc), R.drawable.spice_kitchen));
        landmarkList.add(new Landmark(getString(R.string.test_of_south), getString(R.string.test_of_south_desc), R.drawable.taste_of_south));
        landmarkList.add(new Landmark(getString(R.string.mehfil_hotel), getString(R.string.mehfil_hotel_desc), R.drawable.grand_mehfil));

        RestaurantsListAdapter adapter = new RestaurantsListAdapter(getContext(), landmarkList);
        ListView shoppingListView = (ListView) view.findViewById(R.id.shoppingListView);
        shoppingListView.setAdapter(adapter);

        shoppingListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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



