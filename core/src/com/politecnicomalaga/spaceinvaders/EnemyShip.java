package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EnemyShip {
    private float x;
    private float y;
    private Texture img;
    private float speed;

    public EnemyShip( float x , float y ){
        img = new Texture("naveEnemiga.png");
        this.x=x;
        this.y=y;
        speed = 1;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(img, x, y, 100, 100);

    }

    public void dispose(){
        if (img != null) {
            img.dispose();
        }
    }
}
