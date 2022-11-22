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
        x = 100 + (Gdx.graphics.getWidth() / 2) - (img.getWidth() / 2);
        y = Gdx.graphics.getHeight() - 100;
        speed = 1;
    }

    public void draw(SpriteBatch batch){
        batch.draw(img, x, y, 100, 100);
    }

    public void dispose(){
        if (img != null) {
            img.dispose();
        }
    }
}
