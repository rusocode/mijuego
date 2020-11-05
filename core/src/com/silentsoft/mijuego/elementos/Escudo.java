package com.silentsoft.mijuego.elementos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Escudo {

	private Sprite sprite;
	private Texture textura;

	public Escudo(float x, float y, float ancho, float alto) {
		textura = new Texture("escudo.png");
		sprite = new Sprite(textura);
		sprite.setPosition(x, y);
		sprite.setSize(ancho, alto);
	}

	public void dibujar(SpriteBatch batch) {
		sprite.draw(batch);

	}

	public void setX(float x) {
		sprite.setX(x);
	}

	public void setY(float y) {
		sprite.setY(y);
	}

}
