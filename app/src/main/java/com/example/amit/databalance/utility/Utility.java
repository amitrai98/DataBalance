package com.example.amit.databalance.utility;

import android.app.Activity;

import java.io.IOException;
import java.io.InputStream;

public class Utility {

    public static Utility instance;

    public  static Utility getInstance(){
        if(instance == null)
            instance = new Utility();

        return instance;
    }

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
}
