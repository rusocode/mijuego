package com.silentsoft.mijuego;

/* Todo el codigo se programa en la carpeta core (nucleo), y las demas carpetas lo que hacen es ejecutar el programa en una plataforma especifica. 
 * 
 * Todas las demas carpetas (desktop, android, ios, html, etc.) se utilizan para adaptar la aplicacion a esas plataformas, por mas que java sea un
 * lenguaje muliplataforma.
 * 
 * */

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.silentsoft.mijuego.personajes.Escudo;

public class MiJuego extends Game {
	SpriteBatch batch; // Objeto que se usa para mostrar una imagen
	Escudo escudo;

	// Crea los objetos y declara variables
	/* Cuando se crea la ventana del juego, se ejecuta esta funcion. */
	@Override
	public void create() {
		batch = new SpriteBatch();
		escudo = new Escudo(20, 20, 50, 50);
	}

	/* Esta funcion se ejecuta en paralelo al programa. Su objetivo es dibujar (actualizar) 60 veces por segundo (en este
	 * caso) un sprite en pantalla. */
	@Override
	public void render() {

		// Si no limpio la pantalla, entonces las imagenes anteriores van a estar en pantalla
		Gdx.gl.glClearColor(0, 0, 0, 1); // Limpia la pantalla de un color especifico (RGB, trasnparencia)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // Limpia la pantalla con el color que se indico antes

		// Arriba de la pantalla en blanco (o cualquier color) pinta el sprite
		batch.begin(); // Muestra la imagen
		escudo.dibujar(batch);
		batch.end();

	}

	// Libera la memoria sin uso
	@Override
	public void dispose() {
		batch.dispose();
	}
}
