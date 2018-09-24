package com.example.amit.databalance.utility;

import android.app.Activity;
import android.content.SharedPreferences;

import com.example.amit.databalance.model.DataBalance;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

import static android.content.Context.MODE_PRIVATE;

public class Utility {

    private static Utility instance;
    private SharedPreferences mPrefs;


    /**
     * provides instace of activity
     * @return utility instance.
     */
    public  static Utility getInstance(){
        if(instance == null)
            instance = new Utility();

        return instance;
    }

    /**
     * loads json from assets file and coverts it into string.
     * @param activity instance.
     * @return string response from json.
     */
    public String loadJSONFromAsset(Activity activity) {
        String json = null;
        try {
            InputStream is = activity.getAssets().open("collection.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }


    /**
     * stores user data into pref
     * @param activity instance
     */
    public void storeUserData(Activity activity){
        if (mPrefs == null)
            mPrefs = activity.getPreferences(MODE_PRIVATE);

        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        prefsEditor.putString(AppConstants.USER_DATA, loadJSONFromAsset(activity));
        prefsEditor.apply();
    }


    /**
     * provides data balance object to the requester.
     * @param activity instance
     * @return Datatbalance object
     */
    public DataBalance getDataBalance(Activity activity){
        Gson gson = new Gson();
        String json = mPrefs.getString(AppConstants.USER_DATA, null);
        DataBalance obj = gson.fromJson(json, DataBalance.class);
        return  obj;
    }
}
