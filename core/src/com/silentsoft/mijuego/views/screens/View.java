package com.silentsoft.mijuego.views.screens;

import com.badlogic.gdx.Screen;

public abstract class View implements Screen {

	@Override
	public void show() {
	}

	@Override
	public void render(float delta) {
		// Limpia la pantalla
		// Gdx.gl.glClearColor(0, 0, 0, 1);
		// Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void dispose() {
	}

}
