package com.abdelrahman.raafaat.airassult;

//import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.abdelrahman.raafaat.airassult.R;

public class MainActivity extends Activity {

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