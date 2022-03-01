package com.example.imagegallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class MenuFrag extends ListFragment {
    String[] menus = {"Flowers", "Animals","Foods"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.menu_frag, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, menus);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView list, View v, int position, long id) {
        ContentFrag imv = (ContentFrag) getFragmentManager().findFragmentById(R.id.ContentFrag);
        imv.change(menus[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
