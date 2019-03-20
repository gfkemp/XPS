/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.xps.GUI;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.ArrayList;

/**
 *
 * @author Greg Clemp
 */
public class GUIController {
    
    private float screenWidth;
    private float screenHeight;
    private ArrayList<Frame> frames;
    private SpriteBatch batch;

    public GUIController(SpriteBatch batch, float screenWidth, float screenHeight) {
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.batch = batch;
        
        frames = new ArrayList<Frame>();
        
        frames.add(new Frame(screenWidth/4, screenHeight/4, screenWidth/2, screenHeight/2));
        frames.add(new Frame(screenWidth/1.5f, screenHeight/8, screenWidth/8, screenHeight/8));
        frames.add(new Frame(0, 0, screenWidth/5, screenHeight/5));
    }

    public void update() {
        for (Frame f : frames){
            f.update(batch);
        }
    }
    
}
