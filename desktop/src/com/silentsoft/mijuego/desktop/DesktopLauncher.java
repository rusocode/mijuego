package com.silentsoft.mijuego.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.silentsoft.mijuego.Main;
import com.silentsoft.mijuego.utils.Config;

public class DesktopLauncher {
	public static void main(String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		// El objeto config configura el programa
		// config.title = "Test";
		config.width = Config.ANCHO;
		config.height = Config.ALTO;
		config.resizable = false;

		new LwjglApplication(new Main(), config);

	}
}
