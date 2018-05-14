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

public class RestaurantsFragment extends Fragment {
    View view;

    public RestaurantsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.shopping_fragment, container, false);

        ArrayList<Landmark> landmarkList = new ArrayList<>();
        landmarkList.add(new Landmark("Rajkamal Square","Rajkamal Square was named after the famous Rajkamal Theater, where the plays were staged those days. Now we have a Cenema Theater at that place. This place is the heart of the city and you will get really nice street food here.", R.drawable.rajkalam_square));
        landmarkList.add(new Landmark("Spice Kitchen","Spice Kitchen is essentially the best Restaurant you can go out to! The Indian and oriental food options are their speciality and you'd get a reasonably decent range of options at the adjoining bar too.", R.drawable.spice_kitchen));
        landmarkList.add(new Landmark("Taste Of South","Good ambience and nice food quality. Great service, too. Price is also very reasonable looking at all the features. The quality and quantity of food is perfect. Thali of this restaurant is also very good.", R.drawable.taste_of_south));
        landmarkList.add(new Landmark("Hotel Grand Mehfil","My wife and I stayed in this hotel for 2 nights recently for attending a conference. The facade and look of the hotel look attractive and the quality if surely very good for a comparatively  city like Amravati", R.drawable.grand_mehfil));

        RestaurantsListAdapter adapter = new RestaurantsListAdapter(getContext(), landmarkList);
        ListView shoppingListView = (ListView) view.findViewById(R.id.shoppingListView);
        shoppingListView.setAdapter(adapter);

        return view;
    }
}



