package com.silentsoft.mijuego.views.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.silentsoft.mijuego.utils.Render;

public class GameScreen extends ScreenAdapter {

	@Override
	public void render(float delta) {
		Render.limpiarPantalla(1, 1, 1);
	}
	
}
