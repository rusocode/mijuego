package com.silentsoft.mijuego.views.screens;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.elementos.Texto;
import com.silentsoft.mijuego.utils.Config;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class MenuView extends View {

	SpriteBatch batch;
	Imagen imagen;
	Texto t;

	@Override
	public void show() {
		imagen = new Imagen(Recursos.FONDO);
		imagen.setSize(Config.ANCHO, Config.ALTO);
		batch = Render.batch;

		t = new Texto(Recursos.RUTA_FUENTE, 65, Color.BLACK, false);
		t.setTexto("Fuente");
		t.setPosition(100, 100);
	}

	@Override
	public void render(float delta) {

		batch.begin();
		imagen.dibujar();
		t.dibujar();
		batch.end();
	}

}
