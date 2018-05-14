package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhijeetb on 14/05/2018.
 */

public class ShopingListAdapter extends ArrayAdapter<Landmark> {

    public ShopingListAdapter(@NonNull Context context, ArrayList<Landmark> landmarks) {
        super(context, 0,landmarks);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
        }

        Landmark currentLandmark = getItem(position);

        TextView titleTextView = (TextView)convertView.findViewById(R.id.itemTitleTextView);
        titleTextView.setText("Busyland");

        TextView  durationTextView = (TextView)convertView.findViewById(R.id.itemDescriptionTextView);
        durationTextView.setText("This place is design for wholesale fashion industry, but by people's response they decide to retail. Here you found all type of clothes, shoes, accessory and many more, you can also called it a shopping hub. Amravati's mega clothes stores but I didn't find reasonable prices. Good for marriage clothes.");

        ImageView imageView = (ImageView)convertView.findViewById(R.id.itmeImageView);
        imageView.setImageResource(R.drawable.busy_land);
        return convertView;

    }


}


