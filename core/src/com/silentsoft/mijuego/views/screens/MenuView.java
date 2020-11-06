package com.silentsoft.mijuego.views.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class MenuView extends View {

	SpriteBatch batch;
	Imagen imagen;

	@Override
	public void show() {
		imagen = new Imagen(Recursos.FONDO);
		batch = Render.batch;
	}

	@Override
	public void render(float delta) {
		batch.begin();
		imagen.dibujar();
		batch.end();
	}

}
