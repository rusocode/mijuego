package com.silentsoft.mijuego.pantallas;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class PantallaCarga implements Screen {

	Imagen imagen;
	SpriteBatch batch;
	boolean fadeInTerminado;
	float a = 0;
	float contTiempo = 0, contEspera = 5;

	// Se llama en la nueva pantalla, si existe
	@Override
	public void show() {
		System.out.println("show()");
		imagen = new Imagen(Recursos.FONDO);

		batch = Render.batch; // Guarda la referencia a la direccion del objeto de clase
	}

	@Override
	public void render(float delta) {
		System.out.println("render() de la interfaz Screen");

		// Limpia la pantalla antes de dibujar el sprite
		Render.limpiarPantalla(0, 0, 0);

		procesarFade();

		batch.begin(); // Muestra la imagen
		imagen.dibujar();
		batch.end();

	}

	private void procesarFade() {
		if (!fadeInTerminado) {
			if (a <= 1) {
				imagen.setTransparencia(a);
				a += 0.01f;
			}
		}

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
