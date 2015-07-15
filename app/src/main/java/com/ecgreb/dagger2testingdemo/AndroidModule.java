package com.ecgreb.dagger2testingdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidModule {
    private final MyApplication application;

    public AndroidModule(MyApplication application) {
        this.application = application;
    }

    @Provides @Singleton StringFactory provideStringFactory() {
        return new StringFactory(application);
    }
}
