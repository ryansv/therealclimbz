package com.dab.climbz;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    
    private static final String LOG_TAG = "MainActivity";
    private String[] mRouteNames= {"awesome 5.10","shitty 5.9","crimpy 12c","choss","awesome 5.10","shitty 5.9","crimpy 12c","choss",
            "awesome 5.10","shitty 5.9","crimpy 12c","choss"};
    
    private ListView mRouteListView;
    private ArrayAdapter mArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mRouteListView = getListView();
        mArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice, mRouteNames);
        mRouteListView.setAdapter(mArrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {        
        CheckedTextView check = (CheckedTextView)v;
        check.setChecked(!check.isChecked());
    }    
}
