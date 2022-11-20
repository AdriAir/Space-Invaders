package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EnemyShip {
    private int x;
    private int y;
    private Texture img;
    private int speed;

    public EnemyShip(){
        img = new Texture("naveEnemiga.png");
        x = (Gdx.graphics.getWidth() / 2) - (img.getWidth() / 2);
        y = 10;
        speed = 1;
    }

    public void draw(SpriteBatch batch){
        batch.draw(img, x, y);
    }

    public void dispose(){
        if (img != null) {
            img.dispose();
        }
    }
}
