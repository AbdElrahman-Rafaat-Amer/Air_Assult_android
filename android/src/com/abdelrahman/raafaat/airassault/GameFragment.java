package com.abdelrahman.raafaat.airassault;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.abdelrahman.raafaat.airassault.databinding.FragmentGameBinding;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.ApplicationLogger;
import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.LifecycleListener;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidAudio;
import com.badlogic.gdx.backends.android.AndroidEventListener;
import com.badlogic.gdx.backends.android.AndroidFiles;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.badlogic.gdx.backends.android.AndroidInput;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Clipboard;
import com.badlogic.gdx.utils.SnapshotArray;

public class GameFragment extends AndroidFragmentApplication {

    private FragmentGameBinding binding;
    private AirAssault gameScene = new AirAssault();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
//        initializeForView(gameScene, config);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public GameFragment() {
        super();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    protected FrameLayout.LayoutParams createLayoutParams() {
        return super.createLayoutParams();
    }

    @Override
    protected void createWakeLock(boolean use) {
        super.createWakeLock(use);
    }

    @Override
    public void useImmersiveMode(boolean use) {
        super.useImmersiveMode(use);
    }

    @Override
    public View initializeForView(ApplicationListener listener) {
        return super.initializeForView(listener);
    }

    @Override
    public View initializeForView(ApplicationListener listener, AndroidApplicationConfiguration config) {
        return super.initializeForView(listener, config);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public ApplicationListener getApplicationListener() {
        return super.getApplicationListener();
    }

    @Override
    public Audio getAudio() {
        return super.getAudio();
    }

    @Override
    public Files getFiles() {
        return super.getFiles();
    }

    @Override
    public Graphics getGraphics() {
        return super.getGraphics();
    }

    @Override
    public AndroidInput getInput() {
        return super.getInput();
    }

    @Override
    public Net getNet() {
        return super.getNet();
    }

    @Override
    public ApplicationType getType() {
        return super.getType();
    }

    @Override
    public int getVersion() {
        return super.getVersion();
    }

    @Override
    public long getJavaHeap() {
        return super.getJavaHeap();
    }

    @Override
    public long getNativeHeap() {
        return super.getNativeHeap();
    }

    @Override
    public Preferences getPreferences(String name) {
        return super.getPreferences(name);
    }

    @Override
    public Clipboard getClipboard() {
        return super.getClipboard();
    }

    @Override
    public void postRunnable(Runnable runnable) {
        super.postRunnable(runnable);
    }

    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
    }

    @Override
    public void exit() {
        super.exit();
    }

    @Override
    public void debug(String tag, String message) {
        super.debug(tag, message);
    }

    @Override
    public void debug(String tag, String message, Throwable exception) {
        super.debug(tag, message, exception);
    }

    @Override
    public void log(String tag, String message) {
        super.log(tag, message);
    }

    @Override
    public void log(String tag, String message, Throwable exception) {
        super.log(tag, message, exception);
    }

    @Override
    public void error(String tag, String message) {
        super.error(tag, message);
    }

    @Override
    public void error(String tag, String message, Throwable exception) {
        super.error(tag, message, exception);
    }

    @Override
    public void setLogLevel(int logLevel) {
        super.setLogLevel(logLevel);
    }

    @Override
    public int getLogLevel() {
        return super.getLogLevel();
    }

    @Override
    public void setApplicationLogger(ApplicationLogger applicationLogger) {
        super.setApplicationLogger(applicationLogger);
    }

    @Override
    public ApplicationLogger getApplicationLogger() {
        return super.getApplicationLogger();
    }

    @Override
    public void addLifecycleListener(LifecycleListener listener) {
        super.addLifecycleListener(listener);
    }

    @Override
    public void removeLifecycleListener(LifecycleListener listener) {
        super.removeLifecycleListener(listener);
    }

    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Override
    public Array<Runnable> getRunnables() {
        return super.getRunnables();
    }

    @Override
    public Array<Runnable> getExecutedRunnables() {
        return super.getExecutedRunnables();
    }

    @Override
    public void runOnUiThread(Runnable runnable) {
        super.runOnUiThread(runnable);
    }

    @Override
    public SnapshotArray<LifecycleListener> getLifecycleListeners() {
        return super.getLifecycleListeners();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void addAndroidEventListener(AndroidEventListener listener) {
        super.addAndroidEventListener(listener);
    }

    @Override
    public void removeAndroidEventListener(AndroidEventListener listener) {
        super.removeAndroidEventListener(listener);
    }

    @Override
    public Window getApplicationWindow() {
        return super.getApplicationWindow();
    }

    @Override
    public Handler getHandler() {
        return super.getHandler();
    }

    @Override
    public AndroidAudio createAudio(Context context, AndroidApplicationConfiguration config) {
        return super.createAudio(context, config);
    }

    @Override
    public AndroidInput createInput(Application activity, Context context, Object view, AndroidApplicationConfiguration config) {
        return super.createInput(activity, context, view, config);
    }

    @Override
    protected AndroidFiles createFiles() {
        return super.createFiles();
    }

    @Override
    public WindowManager getWindowManager() {
        return super.getWindowManager();
    }
}