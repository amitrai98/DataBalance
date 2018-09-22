package com.example.amit.databalance.dagger.components;

import com.example.amit.databalance.dagger.modules.MyAppModule;
import com.example.amit.databalance.screens.login.LoginActivity;

import dagger.Component;

@Component(modules = {MyAppModule.class})
public interface MyAppComponent {
    void inject(LoginActivity activity);
}
