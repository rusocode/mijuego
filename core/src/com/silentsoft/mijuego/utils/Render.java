package com.silentsoft.mijuego.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.silentsoft.mijuego.Mainn;

public class Render {

	public static SpriteBatch batch; // Objeto que se usa para mostrar una imagen
	public static Mainn app;

	public static void limpiarPantalla(int r, int g, int b) {
		Gdx.gl.glClearColor(r, g, b, 1); // Limpia la pantalla de un color especifico
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // Limpia la pantalla con el color que se indico antes
	}

}
