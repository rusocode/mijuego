package com.silentsoft.mijuego.views.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.elementos.Texto;
import com.silentsoft.mijuego.io.Entrada;
import com.silentsoft.mijuego.utils.Config;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class MenuView extends View {

	SpriteBatch batch;
	Imagen imagen;
	Texto t1, t2, t3, t4;

	int op = 1;

	float tiempo;

	Entrada entrada = new Entrada(this);

	@Override
	public void show() {
		imagen = new Imagen(Recursos.FONDO);
		imagen.setSize(Config.ANCHO, Config.ALTO);
		batch = Render.batch;

		Gdx.input.setInputProcessor(entrada);

		t1 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
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

		tiempo += delta;

		// Si sigo apretando la tecla pero ese tiempo no supera el 0.09f, entonces no me deja avanzar de opcion
		if (entrada.isAbajo()) {
			if (tiempo > 0.1f) { // 10 milisegundo
				tiempo = 0;
				op++;
				if (op > 4) op = 1;
			}
		}

		if (op == 1) {
			t1.setColor(Color.BLACK);
			t2.setColor(Color.WHITE);
			t4.setColor(Color.WHITE);
		} else if (op == 2) {
			t1.setColor(Color.WHITE);
			t2.setColor(Color.BLACK);
			t3.setColor(Color.WHITE);
		} else if (op == 3) {
			t2.setColor(Color.WHITE);
			t3.setColor(Color.BLACK);
			t4.setColor(Color.WHITE);
		} else if (op == 4) {
			t1.setColor(Color.WHITE);
			t3.setColor(Color.WHITE);
			t4.setColor(Color.BLACK);
		}

	}

}
