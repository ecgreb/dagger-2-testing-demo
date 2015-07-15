package com.ecgreb.dagger2testingdemo;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestAndroidModule {
    private final TestMyApplication application;

    public TestAndroidModule(TestMyApplication application) {
        this.application = application;
    }

    @Provides @Singleton StringFactory provideStringFactory() {
        StringFactory mockStringFactory = Mockito.mock(StringFactory.class);
        Mockito.when(mockStringFactory.makeText()).thenReturn("Fake greeting");
        return mockStringFactory;
    }
}
