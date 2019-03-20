package com.mygdx.xps;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.xps.GUI.GUIController;

public class XPSGame extends ApplicationAdapter {
    SpriteBatch batch;
    GUIController gui;

    @Override
    public void create () {
        int h = 500;
        int w = 500;
        Gdx.graphics.setWindowedMode(w, h);
        Gdx.graphics.setResizable(false);
        batch = new SpriteBatch();

        gui = new GUIController(batch, w, h);
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        gui.update();
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
    }
}
