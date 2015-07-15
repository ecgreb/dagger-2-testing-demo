package com.ecgreb.dagger2testingdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends ActionBarActivity {
    @Inject StringFactory stringFactory;
    @Inject NumberFactory numberFactory;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication()).component().inject(this);
        ((TextView) findViewById(R.id.greeting)).setText(stringFactory.makeText());
        ((TextView) findViewById(R.id.number)).setText("The magic number is "
                + numberFactory.getMagicNumber() + ".");
    }
}
