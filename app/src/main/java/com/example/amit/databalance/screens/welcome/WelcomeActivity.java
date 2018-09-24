package com.example.amit.databalance.screens.welcome;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.amit.databalance.R;
import com.example.amit.databalance.databinding.ActivityWelcomeBinding;
import com.example.amit.databalance.model.DataBalance;
import com.example.amit.databalance.screens.data_balance.DataBalanceActivity;
import com.example.amit.databalance.screens.login.LoginViewModal;
import com.example.amit.databalance.utility.AppConstants;
import com.example.amit.databalance.utility.Utility;

import java.io.Serializable;

public class WelcomeActivity extends AppCompatActivity {

    private final int WELCOME_DISPLAY_LENGTH = 3000;
    private DataBalance dataBalance = null;
    private ActivityWelcomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome);

        dataBalance = Utility.getInstance().getDataBalance(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome );
        binding.setWelcome(new WelcomeVM(dataBalance));
        binding.executePendingBindings();




        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(WelcomeActivity.this,
                        DataBalanceActivity.class);
                WelcomeActivity.this.startActivity(mainIntent);
            }
        }, WELCOME_DISPLAY_LENGTH);

    }
}
