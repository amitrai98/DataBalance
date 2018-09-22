package com.example.amit.databalance.screens.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.example.amit.databalance.BR;
import com.example.amit.databalance.model.DataBalance;
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

    public void attemptLogin(){
        Log.e(TAG, "username is  "+password);
        Log.e(TAG, "password is  "+username);
        Gson gson = new Gson();
        String response = Utility.getInstance().loadJSONFromAsset(activity);
        DataBalance dataBalance = gson.fromJson(response, DataBalance.class);
        Log.e(TAG, "response "+response);
    }

}
