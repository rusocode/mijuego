package com.silentsoft.mijuego.views.screens;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.elementos.Texto;
import com.silentsoft.mijuego.io.Entrada;
import com.silentsoft.mijuego.utils.Config;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class MainMenuScreen extends ScreenAdapter {

	SpriteBatch batch;
	Imagen fondo;
	Texto t1, t2, t3, t4, coordenadas;

	int op = 1;

	float tiempo;

	Entrada entrada = new Entrada(this);

	ArrayList<Texto> textos = new ArrayList<>();

	ShapeRenderer sr;

	@Override
	public void show() {
		fondo = new Imagen(Recursos.FONDO);
		fondo.setSize(Config.ANCHO, Config.ALTO);
		batch = Render.batch;

		sr = new ShapeRenderer();

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

		coordenadas = new Texto(Recursos.FUENTE_MEDIEVAL, 35, Color.WHITE, true);
		coordenadas.setY(Config.ALTO);

	}

	@Override
	public void render(float delta) {

		// Dibuja el fondo, las coordenadas y los textos
		batch.begin();

		fondo.dibujar();

		for (Texto texto : textos)
			texto.dibujar();

		coordenadas.setTexto("X: " + entrada.getMouseX() + "\nY: " + entrada.getMouseY());
		coordenadas.dibujar();

		batch.end();

		// Similar al batch
		sr.begin(ShapeType.Line);
		sr.setColor(Color.PINK);
		// Dibuja un rectangulo para cada texto (tip para debuggear los clicks del mouse)
		for (int i = 0; i < textos.size(); i++)
			sr.rect(textos.get(i).getX(), textos.get(i).getY() - textos.get(i).getAlto(), textos.get(i).getAncho(), textos.get(i).getAlto());
		sr.end();

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

		for (int i = 0; i < textos.size(); i++) {
			if (i == (op - 1)) textos.get(i).setColor(Color.YELLOW);
			else textos.get(i).setColor(Color.WHITE);
		}

		if (entrada.isEnter() && op == 1) Render.app.setScreen(new GameScreen());

		/* Si el mouse X es mayor o igual a X del texto y el mouse X es menor o igual a X del texto + el ancho, es decir, si el
		 * mouse esta dentro del cuadrado del texto, entonces... */
		if ((entrada.getMouseX() >= textos.get(0).getX()) && (entrada.getMouseX() <= (textos.get(0).getX() + textos.get(0).getAncho()))) {
			if ((entrada.getMouseY() >= textos.get(0).getY() - textos.get(0).getAlto()) && (entrada.getMouseY() <= (textos.get(0).getY()))) {
				// textos.get(1).setColor(Color.YELLOW);
				System.out.println("ola");

			}

		}

	}

}
