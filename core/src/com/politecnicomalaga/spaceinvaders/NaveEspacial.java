package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;

public class NaveEspacial extends ObjetoVolador{

    private String imgStrNave;

    public NaveEspacial (float posX, float posY, float velX,  String imgStrNave, float width, float height){

        super(posX, posY, velX, 0, imgStrNave, width, height);
    }

    @Override
    public void moverse(){
        posX += velX;
    }

}
