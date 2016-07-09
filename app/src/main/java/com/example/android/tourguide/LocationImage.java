package com.example.android.tourguide;

/**
 * Created by benwong on 2016-07-09.
 */
public class LocationImage {
    public String name;
    public String location;
    public int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public LocationImage(String name, String location, int image) {
        this.name = name;
        this.location = location;
        this.image = image;
    }
}
