package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class libGDX extends ApplicationAdapter {
	SpriteBatch batch;
	Squadron mySquadron;
	int pasos;
	int screenXMiddle;


	@Override
	public void create () {
		batch = new SpriteBatch();
		pasos = 1;
		screenXMiddle = Gdx.graphics.getWidth() / 2;

	}

	@Override
	public void render () {

		if (Gdx.input.isTouched()) {

			if (Gdx.input.getX() <= screenXMiddle) {
			} else if (Gdx.input.getX() >= screenXMiddle) {
			} else {
			}
		} else if (Gdx.input.isKeyPressed(Input.Keys.ANY_KEY)) {

			if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			} else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			} else {
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

		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();

	}

}
