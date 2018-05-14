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

public class ShoppingFragment extends Fragment {
    View view;

    public ShoppingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.shopping_fragment, container, false);

        ArrayList<Landmark> landmarkList = new ArrayList<>();
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());
        landmarkList.add(new Landmark());

        ShopingListAdapter adapter = new ShopingListAdapter(getContext(), landmarkList);
        ListView shoppingListView = (ListView) view.findViewById(R.id.shoppingListView);
        shoppingListView.setAdapter(adapter);

        return view;
    }
}



