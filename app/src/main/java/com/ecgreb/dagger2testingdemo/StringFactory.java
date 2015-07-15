package com.ecgreb.dagger2testingdemo;

import android.content.Context;

public class StringFactory {
    private Context context;

    public StringFactory(Context context) {
        this.context = context;
    }

    public String makeText() {
        return context.getString(R.string.hello_world);
    }
}
