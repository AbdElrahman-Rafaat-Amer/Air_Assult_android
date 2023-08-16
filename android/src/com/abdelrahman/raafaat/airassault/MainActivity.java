package com.abdelrahman.raafaat.airassault;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.abdelrahman.raafaat.airassault.R;


public class MainActivity extends AppCompatActivity {

    private Button easyLevelButton, mediumLevelButton, hardLevelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        easyLevelButton = findViewById(R.id.easyLevelButton);
        mediumLevelButton = findViewById(R.id.mediumLevelButton);
        hardLevelButton = findViewById(R.id.hardLevelButton);

        mediumLevelButton.setOnClickListener(view -> navigateToNextScreen());
        easyLevelButton.setOnClickListener(view -> navigateToNextScreen());
        hardLevelButton.setOnClickListener(view -> navigateToNextScreen());
    }

    private void navigateToNextScreen() {
        startActivity(new Intent(MainActivity.this, GameActivity.class));
        finish();
    }
}