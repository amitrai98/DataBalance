package com.example.amit.databalance.screens.data_balance;

import android.app.Activity;
import android.databinding.BaseObservable;

import com.example.amit.databalance.model.DataBalance;
import com.example.amit.databalance.utility.Utility;

public class DataBalanceVM extends BaseObservable {
    DataBalance dataBalance;
    Activity activity;
    String validity;
    String dataAvailable;

    public DataBalanceVM( Activity activity){
        this.activity = activity;

    }

    public DataBalance getDataBalance() {
        return dataBalance;
    }

    public void setDataBalance(DataBalance dataBalance) {
        this.dataBalance = dataBalance;
    }


    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getDataAvailable() {
        return dataAvailable;
    }

    public void setDataAvailable(String dataAvailable) {
        this.dataAvailable = dataAvailable;
    }
}
