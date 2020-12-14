package com.silentsoft.mijuego.views.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.Main;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class CargaScreen extends View {

	Imagen imagen;
	SpriteBatch batch;
	boolean fadeInTerminado, termina;
	float alpha;
	// Utilizacion del parametro Delta para calcular los intervalos de tiempo
	float cTiempo, tiempoEspera = 5;
	float cTiempoTermina, tiempoTermina = 5;

	Main main;

	public CargaScreen() {
		main = new Main();
	}

	// Muestra la pantalla
	@Override
	public void show() {
		imagen = new Imagen(Recursos.LOGO);
		batch = Render.batch; // Guarda la referencia a la direccion del objeto de clase
	}

	@Override
	public void render(float delta) {

		// Limpia la pantalla antes de dibujar el sprite
		Render.limpiarPantalla(0, 0, 0);

		procesarFade();

		batch.begin(); // Muestra la imagen
		imagen.dibujar();
		batch.end();

	}

	// Procesa la trasnparencia de la imagen para dar un efecto de sirena (prende y apaga)
	private void procesarFade() {
		if (!fadeInTerminado) { // Si la trasnparencia no se termino, entonces...
			alpha += 0.01f; // Suma 0.01 al alpha
			if (alpha >= 1) { // Si alpha es mayor o igual a 1, entonces...
				alpha = 1; // Asigna 1 al aplha para evitar el parpadeo blanco
				fadeInTerminado = true; // Indica que se termino el efecto de "prendido"
			}
		} else { // Si el efecto de "prendido" termino, entonces empieza a "apagar" la imagen
			cTiempo += 0.05f;
			if (cTiempo > tiempoEspera) { // Espera un tiempo antes de empezar a desvanecer la imagen
				alpha -= 0.01f;
				if (alpha <= 0) alpha = 0; // Cuando la transparencia llega a 0, entonces le asigna 0 a alpha para evitar volver a la transparencia 1
				termina = true;
			}
		}

		/* Despues de la pantalla de carga espera un tiempito para cambiar a la pantalla principal, evitando un cambio
		 * abrupto. */
		if (termina) {
			cTiempoTermina += 0.04f;
			if (cTiempoTermina > tiempoEspera) Render.app.setScreen(new MainMenuScreen());
		}

		imagen.setTransparencia(alpha);

	}

}
