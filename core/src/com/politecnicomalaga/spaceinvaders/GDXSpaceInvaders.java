package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GDXSpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	FriendlyShip friendlyShip;
	EnemyShip enemyShip;
	int pasos;
	Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();
		friendlyShip = new FriendlyShip();
		enemyShip = new EnemyShip();
		pasos = 0;
		img = new Texture("background.png");
	}

	@Override
	public void render () {

		ScreenUtils.clear(0.18f, 0.48f, 0.96f, 0);
		batch.begin();
		batch.draw(img,0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		friendlyShip.draw(batch);
		enemyShip.draw(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		friendlyShip.dispose();
		enemyShip.dispose();
	}
}
