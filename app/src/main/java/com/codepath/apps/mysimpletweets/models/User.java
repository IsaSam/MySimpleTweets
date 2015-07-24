package com.codepath.apps.mysimpletweets.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Isaac on 7/23/2015.
 */
public class User {
    //list attributes
    private String name;
    private Long uid;
    private String screename;
    private String profileImageUrl;

    public String getName() {
        return name;
    }

    public Long getUid() {
        return uid;
    }

    public String getScreename() {
        return screename;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    //deserialize the user json => User
    public static User fromJSON(JSONObject json){
        User u =  new User();
        //Extract and fill the values
        try {
            u.name = json.getString("name");
            u.uid = json.getLong("id");
            u.screename =json.getString("screen_name");
            u.profileImageUrl = json.getString("profile_image_url");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Return a user
        return u;
    }
}
