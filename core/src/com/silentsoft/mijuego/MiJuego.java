package com.silentsoft.mijuego;

// import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MiJuego extends Game {
	SpriteBatch batch;
	Texture img;
	int c;
	// Crea el programa!
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	// Metodo que ejecuta el programa 60 veces por segundo
	@Override
	public void render () {
		c++;
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, c, 0);
		batch.end();
	}
	
	// Libera los recursos de la memoria
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
