package com.silentsoft.mijuego.elementos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.silentsoft.mijuego.utils.Render;

public class Imagen {

	private Sprite sprite;
	private Texture textura;

	public Imagen(String ruta) {
		textura = new Texture(ruta);
		sprite = new Sprite(textura);
	}

	public void dibujar() {
		sprite.draw(Render.batch);
	}

}
