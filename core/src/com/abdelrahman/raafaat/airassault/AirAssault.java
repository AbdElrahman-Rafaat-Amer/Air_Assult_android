package com.abdelrahman.raafaat.airassault;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;

import com.badlogic.gdx.math.Rectangle;

import jdk.internal.org.jline.utils.Log;

public class AirAssault extends ApplicationAdapter {
    private Texture playerShip;
    private SpriteBatch batch;
    private OrthographicCamera camera;
    private final int screenWidth = 1000;
    private final int screenHeight = 1000;
    private Rectangle playerBucket;

    @Override
    public void create() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, screenWidth, screenHeight);
        batch = new SpriteBatch();
        playerShip = new Texture("fighter_plane.png");

        playerBucket = new Rectangle();
        playerBucket.width = playerShip.getWidth();
        playerBucket.height = playerShip.getHeight();
        playerBucket.x = screenWidth / 2 - playerBucket.width / 2;
        playerBucket.y = playerShip.getHeight();

    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 1);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(playerShip, playerBucket.x, playerBucket.y);
        batch.end();

        checkTouch();
    }

    private void checkTouch() {

        if (Gdx.input.isTouched()) {
            Vector3 touchLocation = new Vector3();
            touchLocation.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            boolean isPlayerBucketTouched = playerBucket.contains(touchLocation.x, touchLocation.y);
            Gdx.app.log("Abdo isPlayerBucketTouched-----> ", String.valueOf(isPlayerBucketTouched));
            camera.unproject(touchLocation);
            playerBucket.x = touchLocation.x - playerBucket.width / 2;
            playerBucket.y = touchLocation.y - playerBucket.height / 2;
        }
    }
}
