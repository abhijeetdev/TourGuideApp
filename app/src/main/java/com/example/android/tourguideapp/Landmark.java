package com.example.android.tourguideapp;

import java.io.Serializable;
import java.util.List;

/**
 * Created by abhijeetb on 14/05/2018.
 */

public class Landmark implements Serializable {
    private int mImageResourceId;
    private String mTitle;
    private String mDescription;

    public Landmark(String title, String description, int imageResourceId) {
        this.mTitle =title;
        this.mDescription= description;
        this.mImageResourceId = imageResourceId;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    String getTitle() {
        return mTitle;
    }

    String getDescription() {
        return mDescription;
    }

}
