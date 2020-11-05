package com.silentsoft.mijuego.pantallas;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class PantallaCarga implements Screen {

	Imagen imagen;
	SpriteBatch batch;
	boolean fadeInTerminado = false, termina;
	float alpha;
	float cTiempo, tiempoEspera = 5;
	float cTiempoTermina, tiempoTermina = 5;

	// Se llama en la nueva pantalla, si existe
	@Override
	public void show() {
		imagen = new Imagen(Recursos.FONDO);
		batch = Render.batch; // Guarda la referencia a la direccion del objeto de clase

		imagen.setTransparencia(alpha);

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

		if (termina) {
			cTiempoTermina += 0.04f;
			if (cTiempoTermina > tiempoEspera) {
				System.out.println("Ola k ase!");
			}
		}

		imagen.setTransparencia(alpha);

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
