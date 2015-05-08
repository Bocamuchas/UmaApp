package org.bocamuchas.emiliano.umaapp;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;


public class MainActivity extends ListActivity {


    String[] countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        countries = getResources().getStringArray(R.array.countries);
        this.setListAdapter(new ArrayAdapter<String>(
                this,
                R.layout.activity_main,
                R.id.countryName,
                countries
        ));

        /*ListView listView = getListView();

        listView.setOn

        setContentView(R.layout.activity_main);*/
    }
}
