package io.github.xxmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.github.xxmd.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}