package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class GDXSpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	FriendlyShip friendlyShip;
	ArrayList<EnemyShip> squadron;
	ArrayList<EnemyShot> enemyBullets;
	ArrayList<FriendlyShot> friendlyBullets;
	int pasos;
	int screenXMiddle;
	Texture img;


	@Override
	public void create () {
		batch = new SpriteBatch();
		friendlyShip = new FriendlyShip();
		squadron = new ArrayList<EnemyShip>();
		enemyBullets = new ArrayList<EnemyShot>();
		friendlyBullets = new ArrayList<FriendlyShot>();
		pasos = 1;
		img = new Texture("background.png");
		screenXMiddle = Gdx.graphics.getWidth() / 2;
		for (int i = 0; i < 5; i++) {

			//Aqui creamos 5 naves por fila

		}

	}

	@Override
	public void render () {

		if (Gdx.input.justTouched()) {
			//OBTENER X donde se toca
			float posPulsadaX = Gdx.input.getX();

			if (posPulsadaX <= screenXMiddle || Gdx.input.isKeyPressed(Input.Keys.LEFT)) {//Si la posicion cuando pulsen es <= a la mitad del ancho de gráfico....
				friendlyShip.moverse(-2f); //para un lado
			} else if (posPulsadaX >= screenXMiddle || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
				friendlyShip.moverse(2f); //para otro
			} else {

				friendlyShip.moverse(0f);

			}
		}
		pasos++;

		if (pasos == 30){
			//Han pasados 500ms

		} else if(pasos == 60){
			//Ha pasado 1 segundo

			pasos = 1;
		}

		ScreenUtils.clear(0.18f, 0.48f, 0.96f, 0);

		batch.begin();
		batch.draw(img,0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		friendlyShip.draw(batch);

		for (EnemyShip myEnemyShip: squadron) {

			myEnemyShip.draw(batch);
			
		}
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		friendlyShip.dispose();

		for (EnemyShip myEnemyShip: squadron) {

			myEnemyShip.dispose();

		}
		for (EnemyShot myEnemyBullet: enemyBullets) {

			//myEnemyBullet.dispose();

		}
		for (FriendlyShot myFriendlyBullet: friendlyBullets) {

			//myFriendlyBullet.dispose();

		}
	}
}
