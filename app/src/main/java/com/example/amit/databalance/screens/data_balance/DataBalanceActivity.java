package com.example.amit.databalance.screens.data_balance;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.amit.databalance.R;
import com.example.amit.databalance.databinding.ActivityDataBalanceBinding;
import com.example.amit.databalance.model.DataBalance;
import com.example.amit.databalance.screens.login.LoginViewModal;
import com.example.amit.databalance.utility.Utility;

public class DataBalanceActivity extends AppCompatActivity {

    ActivityDataBalanceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBalanceVM dm = new DataBalanceVM(this);
        DataBalance dataBalance = Utility.getInstance().getDataBalance(this);
        dm.setValidity(String.valueOf(dataBalance.getIncluded().get(1).getAttributes().getIncludedDataBalance()));
        dm.setDataAvailable(dataBalance.getIncluded().get(0).getAttributes().getCreditExpiry());

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_balance );
        binding.setDatabalance(dm);
        binding.executePendingBindings();
    }
}
