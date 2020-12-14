package com.silentsoft.mijuego.views.screens;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.elementos.Texto;
import com.silentsoft.mijuego.io.Entrada;
import com.silentsoft.mijuego.utils.Config;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class MainMenuScreen extends View {

	SpriteBatch batch;
	Imagen imagen;
	Texto t1, t2, t3, t4;

	int op = 1;

	float tiempo;

	Entrada entrada = new Entrada(this);

	ArrayList<Texto> textos = new ArrayList<>();

	@Override
	public void show() {
		imagen = new Imagen(Recursos.FONDO);
		imagen.setSize(Config.ANCHO, Config.ALTO);
		batch = Render.batch;

		Gdx.input.setInputProcessor(entrada);

		t1 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
		t1.setTexto("Nueva partida");
		t1.setPosition((Config.ANCHO / 2) - (t1.getAncho() / 2), (Config.ALTO / 2) + 100);
		textos.add(t1);

		t2 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
		t2.setTexto("Online");
		t2.setPosition((Config.ANCHO / 2) - (t2.getAncho() / 2), (Config.ALTO / 2) + 50);
		textos.add(t2);

		t3 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
		t3.setTexto("Opciones");
		t3.setPosition((Config.ANCHO / 2) - (t3.getAncho() / 2), (Config.ALTO / 2));
		textos.add(t3);

		t4 = new Texto(Recursos.FUENTE_RINGS, 35, Color.WHITE, true);
		t4.setTexto("Salir");
		t4.setPosition((Config.ANCHO / 2) - (t4.getAncho() / 2), (Config.ALTO / 2) - 50);
		textos.add(t4);
	}

	@Override
	public void render(float delta) {

		batch.begin();
		imagen.dibujar();
		for (Texto texto : textos)
			texto.dibujar();
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

		if (entrada.isArriba()) {
			if (tiempo > 0.1f) {
				tiempo = 0;
				op--;
				if (op < 1) op = 4;
			}
		}

		if (entrada.isEnter()) {
			if (op == 1) Render.app.setScreen(new GameScreen());
		}

		for (int i = 0; i < textos.size(); i++) {
			if (i == (op - 1)) textos.get(i).setColor(Color.YELLOW);
			else textos.get(i).setColor(Color.WHITE);
		}

	}

}
