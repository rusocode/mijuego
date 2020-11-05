package com.silentsoft.mijuego.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Render {

	public static SpriteBatch batch; // Objeto que se usa para mostrar una imagen

	public static void limpiarPantalla() {
		Gdx.gl.glClearColor(0, 0, 0, 1); // Limpia la pantalla de un color especifico (RGB, trasnparencia)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // Limpia la pantalla con el color que se indico antes
	}

}
