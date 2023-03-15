package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Batallon {

    private Escuadron[] escuadrones;
    private float segmento;
    private float velX;
    //private float velY;


    //Tenemos que calcular la posición de las naves sabiendo que margenX es la PosX0 y que (anchoDisponible / naves-1) + margenX
    public Batallon(int escuadrones, int naves, float screenWidthDisp, float screenHeight, String img, float velX, float naveWidth, float naveHeight, float posX, float posY){

        this.escuadrones = new Escuadron[escuadrones];
        this.segmento = (screenHeight / (escuadrones - 1));
        this.velX = velX;
        for (int i = 0; i < escuadrones; i++) {

            this.escuadrones[i] = new Escuadron(naves, screenWidthDisp, img, velX, naveWidth, naveHeight, posX, posY);
            posY -= this.segmento;

        }
    }

    public void move(){
        for (int i = 0; i < this.escuadrones.length; i++){

            this.escuadrones[i].move();

        }
    }

    public void chocarPared(){
        for (int i = 0; i < this.escuadrones.length; i++){

            this.escuadrones[i].chocarPared();

        }
    }

    public void render(SpriteBatch batch){
        for (int i = 0; i < this.escuadrones.length; i++){
            this.escuadrones[i].render(batch);

        }
    }

    public void dispose(){

        for (int i = 0; i < this.escuadrones.length; i++){

            this.escuadrones[i].dispose();

        }

    }

}
