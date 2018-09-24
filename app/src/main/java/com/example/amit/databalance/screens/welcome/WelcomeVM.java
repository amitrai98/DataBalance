package com.example.amit.databalance.screens.welcome;

import android.databinding.BaseObservable;

import com.example.amit.databalance.model.DataBalance;

public class WelcomeVM extends BaseObservable {
    String UserName;
    DataBalance dataBalance;
    WelcomeVM(DataBalance dataBalance){
        this.dataBalance = dataBalance;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public DataBalance getDataBalance() {
        return dataBalance;
    }

    public void setDataBalance(DataBalance dataBalance) {
        this.dataBalance = dataBalance;
    }
}
