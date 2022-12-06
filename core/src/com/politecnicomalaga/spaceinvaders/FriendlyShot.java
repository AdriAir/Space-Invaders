package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.lang.reflect.Field;

public class FriendlyShot {

    //ESTADO - ATRIBUTOS
private float x, y;
private Texture FrShot;


    //COMPORTAMIENTO - MÉTODOS


    //Constructor
public FriendlyShot() { //Se asigna, crea, nace e inicia nuestro disparo amigo



}
    //Métodos

    //Pintarse
    //¿Qué necesito de fuera, qué usaré de dentro, qué devuelvo?
public void pintarse(SpriteBatch lienzo) {//Fuera: Imagen, Lienzo
    //Que se usará dentro?: Imagen,X, Y.

    //Ordenar al lienzo que coja la imagen y la ponga en el X, Y
    lienzo.draw(FrShot, x, y);
    
}
    //Colisonar nave enemiga

    //Moverse en eje Y

    //Desaparecer/Reciclarse/Disposarse

    //Rebotat(Quizás en el siguiente Sprint)

}


