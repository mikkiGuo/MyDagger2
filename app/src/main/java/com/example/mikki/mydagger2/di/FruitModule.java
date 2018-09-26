package com.example.mikki.mydagger2.di;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class FruitModule {

    private String name;
    private int total;


    @Inject
    public FruitModule(String name, int total) {
        this.name = name;
        this.total = total;
    }

    @Provides
    public String getFruit(){
        return name;
    }

    @Provides
    public Integer getNumber(){
        return total;
    }

}
