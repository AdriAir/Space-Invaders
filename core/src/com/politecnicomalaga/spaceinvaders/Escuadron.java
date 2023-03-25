package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Escuadron{

    private NaveEspacial[] navesEspaciales;
    private float segmento;
    private float velX;
    private float velY;
    private String img;


    //Tenemos que calcular la posición de las naves sabiendo que margenX es la PosX0 y que (anchoDisponible / naves-1) + margenX
    public Escuadron(int naves, float screenWidthDisp, String img, float velX, float naveWidth, float naveHeight, float posX, float posY){

        navesEspaciales = new NaveEspacial[naves];
        this.segmento = (screenWidthDisp / (naves - 1) + naveWidth);
        this.velX = velX;
        this.img = img;

        for (int i = 0; i < naves; i++) {

            this.navesEspaciales[i] = new NaveEspacial(posX, posY, velX, img, naveWidth, naveHeight);
            posX += this.segmento;

        }
    }

    public void move(){
        for (int i = 0; i < this.navesEspaciales.length; i++){

                this.navesEspaciales[i].move();

        }
    }

    public void chocarPared(){

        if (this.navesEspaciales[0].chocarPared() || this.navesEspaciales[this.navesEspaciales.length-1].chocarPared()){

            this.velX *= -1;

            for (int i = 0; i < this.navesEspaciales.length; i++){

                this.navesEspaciales[i].setVelX(this.velX);

            }

        }

    }

    public void render(SpriteBatch batch){
        for (int i = 0; i < this.navesEspaciales.length; i++){
                this.navesEspaciales[i].render(batch);

        }
    }

    public void dispose(){

        for (int i = 0; i < this.navesEspaciales.length; i++){

                this.navesEspaciales[i].dispose();

        }

    }

    public void setVelX(float velX){

        this.velX = velX;

    }

}
