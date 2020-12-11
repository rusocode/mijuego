package com.silentsoft.mijuego.elementos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Vector2;
import com.silentsoft.mijuego.utils.Render;

public class Texto {
	BitmapFont fuente;
	private float x, y;
	private String texto;
	GlyphLayout layout;

	public Texto(String ruta, int dimension, Color color, boolean sombra) {

		// Carga la fuente
		FreeTypeFontGenerator generador = new FreeTypeFontGenerator(Gdx.files.internal(ruta));
		// Configura la fuente
		FreeTypeFontGenerator.FreeTypeFontParameter parametro = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parametro.size = dimension;
		parametro.color = color;

		if (sombra) {
			parametro.shadowColor = Color.BLACK;
			parametro.shadowOffsetX = 1;
			parametro.shadowOffsetY = 1;
		}

		fuente = generador.generateFont(parametro);

		layout = new GlyphLayout();
	}

	public void dibujar() {
		fuente.draw(Render.batch, texto, x, y);
	}

	public void setColor(Color color) {
		fuente.setColor(color);
	}
	
	public float getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getY() {
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
		layout.setText(fuente, texto);
	}

	public float getAncho() {
		return layout.width;
	}

	public float getAlto() {
		return layout.height;
	}

	public Vector2 getDimension() {
		return new Vector2(layout.width, layout.height);
	}

	public Vector2 getPosicion() {
		return new Vector2(x, y);
	}

	public void setPosition(float x, float y) {
		this.x = x;
		this.y = y;
	}

}
