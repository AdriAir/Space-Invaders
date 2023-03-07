package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class GDXSpaceInvaders extends ApplicationAdapter {
	
	//ESTADO
	private SpriteBatch batch;
	private Disparo bala;
	private ArrayList<ObjetoVolador> miListaDeElementos;

	//COMPORTAMIENTO

	//RESTO COMPORTAMIENTOS

	//¿CONSTRUCTOR? NO TENGO, pero me dicen que create hace las veces de contructor

	@Override
	public void create () {
		int x,y;
		Random r = new Random();

		batch = new SpriteBatch();
		bala = new Disparo(100, 100,0, "bala.png", 50, 50);

		miListaDeElementos = new ArrayList<>();

		// Primero se divide el ancho de la pantalla entre el número de naves + 1.
		// Este número lo ponemos en segmento
		// Ahora se inicializa posicion a 0
		// Y repetimos : crear la nave en la posicion += segmento tantas veces como naves queramos

		int segmento = Gdx.graphics.getWidth()/6;
		int posicion = 0;
		for (int i = 0; i < 5; i++){
			posicion += segmento;
			miListaDeElementos.add(new NaveEspacial(posicion, Gdx.graphics.getHeight()-100, -1, "nave.png", 40, 40));
		}
	}

	@Override
	public void render () {

		Random r = new Random();

		ScreenUtils.clear(0f, 0f, 0f, 1);

		batch.begin();

		bala.acelY(0.5f);
		bala.moverse();

		bala.render(batch);

		for(ObjetoVolador ov:miListaDeElementos){

			//Controlar lo que pasa
			ov.moverse();

			//dibujar despues
			ov.render(batch);
		}


		batch.end();

	}
	
	@Override
	public void dispose () {

		batch.dispose();

		for(ObjetoVolador ov:miListaDeElementos){
			ov.dispose();
		}
		bala.dispose();

	}

}
