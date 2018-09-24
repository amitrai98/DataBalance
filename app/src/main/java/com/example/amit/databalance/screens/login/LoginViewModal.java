package com.example.amit.databalance.screens.login;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Toast;

import com.example.amit.databalance.BR;
import com.example.amit.databalance.model.DataBalance;
import com.example.amit.databalance.screens.welcome.WelcomeActivity;
import com.example.amit.databalance.utility.AppConstants;
import com.example.amit.databalance.utility.Utility;
import com.google.gson.Gson;

public class LoginViewModal extends BaseObservable{

    private String password, username;
    private String TAG = getClass().getSimpleName();
    LoginActivity activity;

    public LoginViewModal(LoginActivity activity){
        this.activity = activity;
    }


    @Bindable
    public String getPasswordQuality() {
        if (password == null || password.isEmpty()) {
            return "Enter a password";
        } else if (password.equals("password")) {
            return "Very bad";
        } else if (password.length() < 6) {
            return "Short";
        } else {
            return "Okay";
        }
    }

    @Bindable
    public String getUsernameQuality() {
        if (username == null || username.isEmpty()) {
            return "Enter a password";
        } else if (username.equals("usernme")) {
            return "Very bad";
        } else if (username.length() < 6) {
            return "Short";
        } else {
            return "Okay";
        }
    }

    void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.passwordQuality);
    }

    void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.usernameQuality);
    }

    @Bindable
    public TextWatcher getPasswordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Do nothing.
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setPassword(s.toString());
                Log.e(TAG, "password "+s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Do nothing.

            }
        };
    }

    @Bindable
    public TextWatcher getUsernameTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Do nothing.
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setUsername(s.toString());
                Log.e(TAG, "username "+s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Do nothing.

            }
        };
    }

    /**
     * attempts login on server but now it verifies local credentials from .json file.
     */
    public void attemptLogin(){
        Log.e(TAG, "username is  "+password);
        Log.e(TAG, "password is  "+username);
        Gson gson = new Gson();
        String response = Utility.getInstance().loadJSONFromAsset(activity);
        DataBalance dataBalance = gson.fromJson(response, DataBalance.class);
        Utility.getInstance().storeUserData(activity);
        Log.e(TAG, "response "+response);

        if(username != null && username.trim().length()> 0 &&
                username.trim().equalsIgnoreCase(dataBalance.getIncluded().get(0).getAttributes().getMsn())){
            Intent welcome_intent = new Intent(activity, WelcomeActivity.class);
            activity.startActivity(welcome_intent);
            activity.finish();
        }else {
            Toast.makeText(activity, "Invalid msn id", Toast.LENGTH_LONG).show();
        }

    }

}
