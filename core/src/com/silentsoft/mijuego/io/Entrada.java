package com.silentsoft.mijuego.io;

import com.badlogic.gdx.InputProcessor;
import com.silentsoft.mijuego.views.screens.MenuView;
import com.badlogic.gdx.Input.Keys;

public class Entrada implements InputProcessor {

	private boolean abajo, arriba;
	
	MenuView app;
	
	public Entrada(MenuView app) {
		this.app = app;
	}

	public boolean isAbajo() {
		return abajo;
	}

	public boolean isArriba() {
		return arriba;
	}

	// Si la tecla se preciona, entonces...
	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Keys.DOWN) abajo = true;
		if (keycode == Keys.UP) arriba = true;
		return false;
	}

	// Si la tecla se suelta, entonces...
	@Override
	public boolean keyUp(int keycode) {
		if (keycode == Keys.DOWN) abajo = false;
		if (keycode == Keys.UP) arriba = false;
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}
