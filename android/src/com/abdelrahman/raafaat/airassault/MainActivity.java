package com.abdelrahman.raafaat.airassault;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.abdelrahman.raafaat.airassault.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mediumLevelButton.setOnClickListener(view -> navigateToNextScreen());
        binding.easyLevelButton.setOnClickListener(view -> navigateToNextScreen());
        binding.hardLevelButton.setOnClickListener(view -> navigateToNextScreen());
    }

    private void navigateToNextScreen() {
        startActivity(new Intent(MainActivity.this, GameActivity.class));
        finish();
    }
}