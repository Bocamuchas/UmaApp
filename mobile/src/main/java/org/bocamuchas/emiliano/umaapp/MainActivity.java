package org.bocamuchas.emiliano.umaapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {


    String[] countries;
    DeveloperDBHelper developerDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        developerDBHelper = new DeveloperDBHelper(getBaseContext());

        countries = getResources().getStringArray(R.array.countries);
        this.setListAdapter(new ArrayAdapter<String>(
                this,
                R.layout.activity_main,
                R.id.countryName,
                countries
        ));

        ListView listView = getListView();

        /// setContentView(R.layout.activity_main);

        SQLiteDatabase sqLiteDatabase = developerDBHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_ID,723292);
        values.put(DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_NAME, "Emiliano E. S. Barbosa");
        values.put(DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_URL, "https://api.github.com/users/emilianoeloi");

        long newRowId;
        newRowId = sqLiteDatabase.insert(DeveloperContract.DeveloperEntry.TABLE_NAME, "", values);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String country = countries[position];
//                Toast.makeText(MainActivity.this, String.format("%s was chosen.", country), Toast.LENGTH_SHORT).show();
                SQLiteDatabase sqLiteDatabaseRead = developerDBHelper.getReadableDatabase();
                String[] projection = {
                        DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_ID,
                        DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_NAME,
                        DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_URL
                };
                String sortOrder = DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_NAME;

                Cursor cursor = sqLiteDatabaseRead.query(DeveloperContract.DeveloperEntry.TABLE_NAME,
                        projection,
                        null,
                        null,
                        null,
                        null,
                        sortOrder);

                cursor.moveToFirst();
                String developerName = cursor.getString(
                        cursor.getColumnIndexOrThrow(DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_NAME)
                );
                Toast.makeText(MainActivity.this, String.format("%s", developerName), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
