package com.politecnicomalaga.spaceinvaders;

class Disparo extends ObjetoVolador{

    private String imgStrDisparo;

    public Disparo (float posX, float posY, float velY, String imgStrDisparo, float width, float height){

        super(posX, posY, 0, velY, imgStrDisparo, width, height);
    }


    @Override
    public void move(){
        posY += velY;

   }


}



