package com.abdelrahman.raafaat.airassault;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.abdelrahman.raafaat.airassault.databinding.ActivityGameBinding;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;

public class GameActivity extends AppCompatActivity implements AndroidFragmentApplication.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityGameBinding binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        GameFragment gameFragment;
        FragmentManager manager = getSupportFragmentManager();
        gameFragment = new GameFragment();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.setReorderingAllowed(true);
        transaction.add(R.id.fragment_container, gameFragment, "GAME_FRAGMENT");
        transaction.commit();

    }

    @Override
    public void exit() {

    }
}