package com.ecgreb.dagger2testingdemo;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

public class MyApplication extends Application {
    @Singleton
    @Component(modules = AndroidModule.class)
    public interface ApplicationComponent {
        void inject(MainActivity mainActivity);
    }

    ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyApplication_ApplicationComponent.builder()
                .androidModule(new AndroidModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return component;
    }
}
