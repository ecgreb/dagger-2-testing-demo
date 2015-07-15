package com.ecgreb.dagger2testingdemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import android.widget.TextView;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {
    private MainActivity mainActivity;

    @Before public void setUp() throws Exception {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test public void shouldNotBeNull() throws Exception {
        assertNotNull(mainActivity);
    }

    @Test public void shouldInjectMockStringFactory() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }
}
