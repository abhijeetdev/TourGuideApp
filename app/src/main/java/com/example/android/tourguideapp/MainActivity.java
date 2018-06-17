package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

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
        viewPageAdapter.addFragment(new LandmarkFragment(), getString(R.string.view_page_title_landmarks));
        viewPageAdapter.addFragment(new NatureFragment(), getString(R.string.view_page_title_nature));
        viewPageAdapter.addFragment(new RestaurantsFragment(), getString(R.string.view_page_title_restaurant));
        viewPageAdapter.addFragment(new FestivalsFragment(), getString(R.string.view_page_title_festivals));

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
