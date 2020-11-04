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

	// Crea los objetos y declara variables
	/* Cuando se crea la ventana del juego, se ejecuta esta funcion. */
	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	// Actualiza el juego (update) cada cierto tiempo (60 fps en este caso)
	/* Funcion que ejecuta el programa en paralelo. */
	@Override
	public void render() {
		// System.out.println("Hola!");
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0); // Dibuja el sprite en la posicion x:y 60 veces por segundo
		batch.end();
	}

	// Libera la memoria sin uso
	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}
}
