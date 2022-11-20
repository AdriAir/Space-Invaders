package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GDXSpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	FriendlyShip friendlyShip;
	int pasos;
	private Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();
		friendlyShip = new FriendlyShip();
		pasos = 0;
		img = new Texture("background.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.18f, 0.48f, 0.96f, 0);
		batch.begin();
		friendlyShip.draw(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		friendlyShip.dispose();
	}
}