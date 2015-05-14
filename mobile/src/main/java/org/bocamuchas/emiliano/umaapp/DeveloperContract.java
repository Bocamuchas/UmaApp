package org.bocamuchas.emiliano.umaapp;

import android.provider.BaseColumns;

/**
 * Created by emilianoeloi on 5/13/15.
 */
public final class DeveloperContract {

    public DeveloperContract(){}

    public static abstract class DeveloperEntry implements BaseColumns{
        public static final String TABLE_NAME = "developers";
        public static final String COLUMN_NAME_DEVELOPER_ID = "developer_id";
        public static final String COLUMN_NAME_DEVELOPER_AVATAR_URL = "avatar_url";
        public static final String COLUMN_NAME_DEVELOPER_GRAVATAR_URL = "gravatar_url";
        public static final String COLUMN_NAME_DEVELOPER_URL = "url";
        public static final String COLUMN_NAME_DEVELOPER_HTML_URL = "html_url";
        public static final String COLUMN_NAME_DEVELOPER_FOLLOWERS_URL = "followers_url";
        public static final String COLUMN_NAME_DEVELOPER_FOLLOWING_URL = "following_url";
        public static final String COLUMN_NAME_DEVELOPER_GIST_URL = "gist_url";
        public static final String COLUMN_NAME_DEVELOPER_STARRED_URL = "starred_url";
        public static final String COLUMN_NAME_DEVELOPER_SUBSCRIPTIONS_URL = "subscriptions_url";
        public static final String COLUMN_NAME_DEVELOPER_ORGANIZATIONS_URL = "organizations_url";
        public static final String COLUMN_NAME_DEVELOPER_REPOS_URL = "repos_url";
        public static final String COLUMN_NAME_DEVELOPER_EVENTS_URL = "events_url";
        public static final String COLUMN_NAME_DEVELOPER_RECEIVED_EVENTS_URL = "received_events_url";
        public static final String COLUMN_NAME_DEVELOPER_TYPE = "type";
        public static final String COLUMN_NAME_DEVELOPER_SITE_ADMIN = "site_admin";
        public static final String COLUMN_NAME_DEVELOPER_NAME = "name";
        public static final String COLUMN_NAME_DEVELOPER_COMPANY = "company";
        public static final String COLUMN_NAME_DEVELOPER_BLOG = "blog";
        public static final String COLUMN_NAME_DEVELOPER_LOCATION = "location";
        public static final String COLUMN_NAME_DEVELOPER_EMAIL = "email";
        public static final String COLUMN_NAME_DEVELOPER_HIREABLE = "hireable";
        public static final String COLUMN_NAME_DEVELOPER_BIO = "bio";
        public static final String COLUMN_NAME_DEVELOPER_PUBLIC_REPOS = "public_repos";
        public static final String COLUMN_NAME_DEVELOPER_PUBLIC_GISTS = "public_gists";
        public static final String COLUMN_NAME_DEVELOPER_FOLLOWERS = "followers";
        public static final String COLUMN_NAME_DEVELOPER_FOLLOWIG = "following";
        public static final String COLUMN_NAME_DEVELOPER_CREATED_AT = "created_at";
        public static final String COLUMN_NAME_DEVELOPER_UPDATED_AT = "updated_at";
    }
}
