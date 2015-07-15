package com.ecgreb.dagger2testingdemo;

import javax.inject.Singleton;

import dagger.Component;

public class TestMyApplication extends MyApplication {
    @Singleton
    @Component(modules = { TestAndroidModule.class, CommonModule.class })
    public interface TestApplicationComponent extends ApplicationComponent {
        void inject(MainActivity mainActivity);
    }

    private TestApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerTestMyApplication_TestApplicationComponent.builder()
                .testAndroidModule(new TestAndroidModule(this))
                .commonModule(new CommonModule())
                .build();
    }

    @Override
    public ApplicationComponent component() {
        return component;
    }
}
