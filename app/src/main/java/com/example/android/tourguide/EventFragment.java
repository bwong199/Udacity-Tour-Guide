package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by benwong on 2016-07-09.
 */
public class EventFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_event, container, false);

        // Construct the data source
        ArrayList<LocationImage> arrayOfLocationImages = new ArrayList<LocationImage>();
// Create the adapter to convert the array to views
        LocationImageAdapter adapter = new LocationImageAdapter(getActivity(), arrayOfLocationImages);
// Attach the adapter to a ListView
        ListView listView = (ListView) v.findViewById(R.id.eventlvItems);

        listView.setAdapter(adapter);

        LocationImage newLocation1 = new LocationImage(getActivity().getString(R.string.stampedeName), getActivity().getString(R.string.stampedeAddress), R.drawable.stampedeimg);

        adapter.add(newLocation1);

        return v;
    }


}
