package com.example.amit.databalance.dagger.modules;



import com.example.amit.databalance.AppInitials;
import com.example.amit.databalance.utility.Utility;

import dagger.Module;
import dagger.Provides;

@Module
public class MyAppModule {
    private final AppInitials demodagger;

    public MyAppModule(AppInitials demodagger){
        this.demodagger = demodagger;
    }

    @Provides
    AppInitials provideApp(){
        return demodagger;
    }

    @Provides
    Utility provideUtility(){
        return new Utility();
    }

}
