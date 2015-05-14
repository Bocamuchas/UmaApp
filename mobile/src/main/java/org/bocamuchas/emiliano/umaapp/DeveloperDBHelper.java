package org.bocamuchas.emiliano.umaapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.DragEvent;

/**
 * Created by emilianoeloi on 5/13/15.
 */
public class DeveloperDBHelper extends SQLiteOpenHelper{

    public static final String TEXT_TYPE = " TEXT";
    public static final String INTEGER_TYPE = " INTEGER";
    public static final String REAL_TYPE =  " REAL";

    public static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_DEVELOPERS =
            "CREATE TABLE " + DeveloperContract.DeveloperEntry.TABLE_NAME + " (" +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_ID + " INTEGER PRIMARY KEY, " +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_AVATAR_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_BIO + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_BLOG + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_COMPANY + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_CREATED_AT + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_EMAIL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_EVENTS_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_FOLLOWERS + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_FOLLOWERS_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_FOLLOWIG + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_FOLLOWING_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_GIST_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_GRAVATAR_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_HIREABLE + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_HTML_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_LOCATION + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_NAME + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_ORGANIZATIONS_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_PUBLIC_GISTS + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_PUBLIC_REPOS + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_RECEIVED_EVENTS_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_REPOS_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_SITE_ADMIN + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_STARRED_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_SUBSCRIPTIONS_URL + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_TYPE + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_UPDATED_AT + TEXT_TYPE + COMMA_SEP +
                    DeveloperContract.DeveloperEntry.COLUMN_NAME_DEVELOPER_URL + TEXT_TYPE + " )";

    public static final String SQL_DROP_DEVELOPERS = "DROP TABLE IF EXISTS " + DeveloperContract.DeveloperEntry.TABLE_NAME;


    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "dev.db";

    public DeveloperDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DEVELOPERS);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DROP_DEVELOPERS);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
