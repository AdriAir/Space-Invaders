package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.Random;

public class libGDX extends ApplicationAdapter {

	private SpriteBatch batch;
	private Disparo bala;
	private Batallon escuadrones;
	private float screenWidth;
	private float screeHeight;


	@Override
	public void create () {
		Gdx.graphics.setResizable(false);
		Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode());
		Gdx.graphics.setWindowedMode(1900, 1000);

		int x,y;
		screeHeight = Gdx.graphics.getHeight();
		screenWidth = Gdx.graphics.getWidth();


		Random rand = new Random();

		batch = new SpriteBatch();
		bala = new Disparo(100, 0,0, "bala.png", 50, 50);

		escuadrones = new Batallon(3, 12, 1000, 300, "enemy.png", 5, 50, 50, 20, 1000);
	}

	@Override
	public void render () {

		Random rand = new Random();

		ScreenUtils.clear(0f, 0f, 0f, 1);

		batch.begin();

		bala.acelY(0.5f);
		bala.move();

		bala.render(batch);

		escuadrones.move();
		escuadrones.chocarPared();

		escuadrones.render(batch);

		batch.end();

	}
	
	@Override
	public void dispose () {

		batch.dispose();
		escuadrones.dispose();
		bala.dispose();

	}

}
