package com.example.pung.codemonkeys;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class SearchResultsFragment extends Fragment {
    ListView search;
    View view;
    SearchListAdapter adapter;
    List<Search> mProductList;

    public SearchResultsFragment() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search_results, container, false);

        mProductList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mProductList.add(new Search(1,"iPhone4", "Apple iPhone4 16GB"));
        mProductList.add(new Search(3,"iPhone4S", "Apple iPhone4S 16GB"));
        mProductList.add(new Search(4,"iPhone5",  "Apple iPhone5 16GB"));
        mProductList.add(new Search(5,"iPhone5S",  "Apple iPhone5S 16GB"));
        mProductList.add(new Search(6,"iPhone6", "Apple iPhone6 16GB"));
        mProductList.add(new Search( 7,"iPhone6S",  "Apple iPhone6S 16GB"));
        mProductList.add(new Search( 8,"iPhone7",  "Apple iPhone7 16GB"));
        mProductList.add(new Search( 9,"iPhone7S",  "Apple iPhon7S 16GB"));
        mProductList.add(new Search(10,"iPhone8",  "Apple iPhone8 16GB"));
        mProductList.add(new Search(11,"iPhone8S",  "Apple iPhone8S 16GB"));

        search = (ListView)view.findViewById(R.id.brewery_search_result_listView);
        adapter = new SearchListAdapter(getActivity().getApplicationContext(), mProductList);
        search.setAdapter(adapter);

        Toast.makeText(getActivity().getApplicationContext(), "Clicked product id =" + search, Toast.LENGTH_SHORT).show();
        return view;
    }


}
