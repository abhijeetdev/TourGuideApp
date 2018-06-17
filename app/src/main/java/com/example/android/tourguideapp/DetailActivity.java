package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private AppCompatDelegate delegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        Landmark landmark = (Landmark) getIntent().getSerializableExtra(Constants.SELECTED_LANDMARK);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle(landmark.getTitle());

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(landmark.getImageResourceId());

        TextView descriptionTextView = (TextView)findViewById(R.id.decriptionTextView);
        descriptionTextView.setText(landmark.getDescription());

    }

}
