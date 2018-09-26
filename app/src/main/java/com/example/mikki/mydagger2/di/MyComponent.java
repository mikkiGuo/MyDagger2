package com.example.mikki.mydagger2.di;

import com.example.mikki.mydagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

//wiring with injection
@Component(modules = {SharePreferenceModule.class, FruitModule.class})
@Singleton
public interface MyComponent {

    //where to inject
    public void inject(MainActivity mainActivity);


}
