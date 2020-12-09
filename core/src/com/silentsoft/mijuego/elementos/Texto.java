package com.silentsoft.mijuego.elementos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.silentsoft.mijuego.utils.Render;

public class Texto {
	BitmapFont fuente;
	private int x, y;
	private String texto;

	public Texto(String ruta, int dimension, Color color, boolean sombra) {

		// Carga la fuente
		FreeTypeFontGenerator generador = new FreeTypeFontGenerator(Gdx.files.internal(ruta));
		// Configura la fuente
		FreeTypeFontGenerator.FreeTypeFontParameter parametro = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parametro.size = 30;
		parametro.color = Color.WHITE;

		if (sombra) {
			parametro.shadowColor = Color.BLACK;
			parametro.shadowOffsetX = 1;
			parametro.shadowOffsetY = 1;
		}

		fuente = generador.generateFont(parametro);
	}

	public void dibujar() {
		fuente.draw(Render.batch, texto, x, y);
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
