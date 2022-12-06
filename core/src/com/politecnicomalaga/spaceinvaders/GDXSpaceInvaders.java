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
	Squadron mySquadron;
	ArrayList<EnemyShot> enemyBullets;
	ArrayList<FriendlyShot> friendlyBullets;
	int pasos;
	int screenXMiddle;
	Texture img;


	@Override
	public void create () {
		batch = new SpriteBatch();
		friendlyShip = new FriendlyShip();
		mySquadron = new Squadron(5, 3);
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

		if (Gdx.input.isTouched()) {

			if (Gdx.input.getX() <= screenXMiddle) {
				friendlyShip.moverse(-2f);
			} else if (Gdx.input.getX() >= screenXMiddle) {
				friendlyShip.moverse(2f);
			} else {

				friendlyShip.moverse(0f);

			}
		} else if (Gdx.input.isKeyPressed(Input.Keys.ANY_KEY)) {

			if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
				friendlyShip.moverse(-2f);
			} else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
				friendlyShip.moverse(2f);
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

		for (EnemyShip myEnemyShip: mySquadron.getShips()) {

			myEnemyShip.draw(batch);
			
		}
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		friendlyShip.dispose();

		for (EnemyShip myEnemyShip:  mySquadron.getShips()) {

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
