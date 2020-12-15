package com.silentsoft.mijuego.io;

import com.badlogic.gdx.InputProcessor;
import com.silentsoft.mijuego.utils.Config;
import com.silentsoft.mijuego.views.screens.MainMenuScreen;
import com.badlogic.gdx.Input.Keys;

public class Entrada implements InputProcessor {

	private boolean abajo, arriba, enter;
	private int mouseX, mouseY;

	MainMenuScreen app;

	public Entrada(MainMenuScreen app) {
		this.app = app;
	}

	// Si la tecla se preciona, entonces...
	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Keys.DOWN) abajo = true;
		if (keycode == Keys.UP) arriba = true;
		if (keycode == Keys.ENTER) enter = true;
		return false;
	}

	// Si la tecla se suelta, entonces...
	@Override
	public boolean keyUp(int keycode) {
		if (keycode == Keys.DOWN) abajo = false;
		if (keycode == Keys.UP) arriba = false;
		if (keycode == Keys.ENTER) enter = false;
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
		mouseX = screenX;
		mouseY = Config.ALTO - screenY;
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

	public int getMouseX() {
		return mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public boolean isAbajo() {
		return abajo;
	}

	public boolean isArriba() {
		return arriba;
	}

	public boolean isEnter() {
		return enter;
	}
}
