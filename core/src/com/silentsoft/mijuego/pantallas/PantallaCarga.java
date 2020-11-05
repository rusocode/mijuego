package com.silentsoft.mijuego.pantallas;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.elementos.Imagen;
import com.silentsoft.mijuego.utils.Recursos;
import com.silentsoft.mijuego.utils.Render;

public class PantallaCarga implements Screen {

	Imagen imagen;
	SpriteBatch batch;

	@Override
	public void show() {
		imagen = new Imagen(Recursos.FONDO);
		batch = Render.batch; // Guarda la referencia a la direccion del objeto de clase
	}

	@Override
	public void render(float delta) {
		
		// Pinta la pantalla antes de pintar el sprite
		Render.limpiarPantalla();
		
		// Muestra la imagen
		batch.begin();
		imagen.dibujar();
		batch.end();

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
