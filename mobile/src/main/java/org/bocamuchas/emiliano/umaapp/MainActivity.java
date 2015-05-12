package org.bocamuchas.emiliano.umaapp;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


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

        ListView listView = getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country = countries[position];
                Toast.makeText(MainActivity.this, String.format("%s was chosen.", country), Toast.LENGTH_SHORT).show();
            }
        });

        /// setContentView(R.layout.activity_main);
    }
}
