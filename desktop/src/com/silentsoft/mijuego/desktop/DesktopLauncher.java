package com.silentsoft.mijuego.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.silentsoft.mijuego.MiJuego;

public class DesktopLauncher {
	public static void main (String[] arg) {
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		// El objeto config configura el programa
		config.title = "AO";
		
		new LwjglApplication(new MiJuego(), config);
	}
}
