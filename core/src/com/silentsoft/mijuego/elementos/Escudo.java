package com.silentsoft.mijuego.elementos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Escudo {

	private Sprite sprite;
	private Texture textura; // Represanta una imagen

	public Escudo(float x, float y, float ancho, float alto) {

		textura = new Texture("escudo.png");
		sprite = new Sprite(textura);
		sprite.setPosition(x, y);
		sprite.setSize(ancho, alto);

	}

	public void dibujar(SpriteBatch batch) {

		// Diferencia entre Sprite y SpriteBatch
		/* De una manera simple se puede decir que la clase Sprite es un paquete completo (donde dibujar y con diferentes
		 * factores como tamaño, factor de escala, rotacion…), en donde se evita tener que pasar por parametro los diferentes
		 * factores.
		 * 
		 * Pero si usas "batch.draw(textura, 20,...);" debes indicar la posicion, el tamaño y otros factores que se requieren
		 * para dibujar mediante el metodo draw(). */
		sprite.draw(batch);

	}

	public void setX(float x) {
		sprite.setX(x);
	}

	public void setY(float y) {
		sprite.setY(y);
	}

}
