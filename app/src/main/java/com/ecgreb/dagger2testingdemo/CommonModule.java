package com.ecgreb.dagger2testingdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {
    @Provides @Singleton NumberFactory provideNumberFactory() {
        return new NumberFactory();
    }
}
