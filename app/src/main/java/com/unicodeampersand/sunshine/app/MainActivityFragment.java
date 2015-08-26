package com.unicodeampersand.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList forecastList = new ArrayList<String>();
        forecastList.add("Today - Sunny 81/52");
        forecastList.add("Tomorrow - Sunny 84/55");
        forecastList.add("Wednesday - Sunny 87/59");
        forecastList.add("Thursday - Sunny 85/60");
        forecastList.add("Friday - Mostly Cloudy 74/61");
        forecastList.add("Saturday - Chance of Rain 73/60");
        forecastList.add("Sunday - Chance of Rain 73/58");

        ArrayAdapter<String> forecastAdapter =
                new ArrayAdapter<String>(getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,
                        forecastList);

        ListView myView = (ListView) rootView.findViewById(R.id.listview_forecast);

        myView.setAdapter(forecastAdapter);
        return rootView;
    }
}
