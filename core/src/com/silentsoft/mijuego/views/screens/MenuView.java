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
	Texto t1, t2, t3, t4;

	@Override
	public void show() {
		imagen = new Imagen(Recursos.FONDO);
		imagen.setSize(Config.ANCHO, Config.ALTO);
		batch = Render.batch;

		t1 = new Texto(Recursos.FUENTE_RINGS, 35, Color.BLACK, true);
		t1.setTexto("Nueva partida");
		t1.setPosition((Config.ANCHO / 2) - (t1.getAncho() / 2), (Config.ALTO / 2) + 100);

		t2 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
		t2.setTexto("Online");
		t2.setPosition((Config.ANCHO / 2) - (t2.getAncho() / 2), (Config.ALTO / 2) + 50);

		t3 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
		t3.setTexto("Opciones");
		t3.setPosition((Config.ANCHO / 2) - (t3.getAncho() / 2), (Config.ALTO / 2));

		t4 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
		t4.setTexto("Salir");
		t4.setPosition((Config.ANCHO / 2) - (t4.getAncho() / 2), (Config.ALTO / 2) - 50);
	}

	@Override
	public void render(float delta) {

		batch.begin();
		imagen.dibujar();
		t1.dibujar();
		t2.dibujar();
		t3.dibujar();
		t4.dibujar();
		batch.end();
	}

}
