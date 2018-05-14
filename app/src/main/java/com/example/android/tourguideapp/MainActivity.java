package com.example.android.tourguideapp;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayoutId);
        appBarLayout = (AppBarLayout)findViewById(R.id.appBarId);
        viewPager = (ViewPager)findViewById(R.id.viewPagerId);

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdapter.addFragment(new LandmarkFragment(), "Landmarks");
        viewPageAdapter.addFragment(new NatureFragment(), "Natures");
        viewPageAdapter.addFragment(new ShoppingFragment(), "Shopping");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
