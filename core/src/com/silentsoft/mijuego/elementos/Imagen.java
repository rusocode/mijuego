package com.silentsoft.mijuego.elementos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.silentsoft.mijuego.utils.Render;

public class Imagen {

	private Sprite sprite;
	private Texture textura; // Represanta una imagen

	public Imagen(String ruta) {
		textura = new Texture(ruta);
		sprite = new Sprite(textura); // Crea el sprite con la textura especificada
		sprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}

	public void dibujar() {
		// Diferencia entre Sprite y SpriteBatch
		/* De una manera simple se puede decir que la clase Sprite es un paquete completo (donde dibujar y con diferentes
		 * factores como tamaño, factor de escala, rotacion…), en donde se evita tener que pasar por parametro los diferentes
		 * factores.
		 * 
		 * Pero si usas "batch.draw(textura, 20,...);" debes indicar la posicion, el tamaño y otros factores que se requieren
		 * para dibujar mediante el metodo draw(). */
		sprite.draw(Render.batch);
	}

	public void setTransparencia(float a) {
		sprite.setAlpha(a);
	}

}
