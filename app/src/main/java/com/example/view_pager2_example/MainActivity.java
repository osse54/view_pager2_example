package com.example.view_pager2_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = new Bundle();
        bundle.putString("key", "value");

        // link to frameLayout and CollectionDemoFragment
        getSupportFragmentManager().beginTransaction().add(R.id.fl, CollectionDemoFragment.class, bundle).commit();
        Log.i(TAG, "onCreate: hiihih");
    }
}