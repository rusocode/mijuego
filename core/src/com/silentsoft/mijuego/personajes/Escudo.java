package com.silentsoft.mijuego.personajes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Escudo {

	private Sprite sprite;
	private Texture textura; // Represanta una imagen
	private float x, y;
	private float ancho, alto;

	public Escudo(float x, float y, float ancho, float alto) {

		textura = new Texture("escudo.png");
		sprite = new Sprite(textura);
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;

		sprite.setPosition(x, y);
		sprite.setSize(ancho, alto);

	}

	public void dibujar(SpriteBatch batch) {

		/* Creando una clase aparte para la imagen escudo, nos evitamos pasar los parametros para el objeto batch
		 * (batch.draw(textura, 20, 20, 50, 50);) dejando asi, el codigo mas limpio. */
		sprite.draw(batch); // El sprite ya tiene sus caracteristicas

	}

}
