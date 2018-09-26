package com.example.mikki.mydagger2.di;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;


//di -- dependency injection

@Module
public class SharePreferenceModule {

    private Context context;

    public SharePreferenceModule(Context context) {
        this.context = context;

    }

    @Provides
    public Context provideContext(){
        return context;
    }

    /**
     * method to create sharePreference
     * @Provide help inject sharePreference object into whoever using it,
     * makes two class loosely coupled
     */
    @Provides
    public SharedPreferences provideSharePreference(){

        //return PreferenceManager.getDefaultSharedPreferences(context);
        return context.getSharedPreferences("myFile", Context.MODE_PRIVATE);
    }
}

