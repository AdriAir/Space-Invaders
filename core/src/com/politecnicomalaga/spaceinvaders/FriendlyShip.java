package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

    //ATRIBUTOS
public class FriendlyShip {
    private int x;
    private int y;
    private Texture img;
    private int speed;

    //CONSTRUCTOR
    public FriendlyShip(){
        img = new Texture("nave.png");
        x = (Gdx.graphics.getWidth() / 2) - (img.getWidth() / 2);
        y = 10;
        speed = 1;
    }

    //RESTO DE MÉTODO
    //Movimientos
        public void calculaPosicion(){

        }

    //dibujar
    public void draw(SpriteBatch batch){

        batch.draw(img, x, y);
    }
    //disposar
    public void dispose() {
        if (img != null) {
            img.dispose();
        }
    }
}