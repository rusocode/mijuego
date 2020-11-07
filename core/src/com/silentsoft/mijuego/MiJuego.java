package com.silentsoft.mijuego;

/* Todo el codigo se programa en la carpeta core (nucleo), y las demas carpetas lo que hacen es ejecutar el programa en una
 * plataforma especifica. 
 * 
 * Todas las demas carpetas (desktop, android, ios, html, etc.) se utilizan para adaptar la aplicacion a esas plataformas por mas 
 * que java sea un lenguaje muliplataforma.
 * 
 * */

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.silentsoft.mijuego.utils.Render;
import com.silentsoft.mijuego.views.screens.CargaView;

/* La clase abstracta Game es de alguna manera la implementacion predeterminada de la interfaz ApplicationListener y
 * delega la mayor parte del trabajo a la Screen actual. */
public class MiJuego extends Game {

	// Crea los objetos y declara variables
	/* Cuando se crea la ventana del juego, se ejecuta esta funcion. */
	@Override
	public void create() {

		Render.app = this; // Le pasa la referencia de memoria de esta clase a la variable app de la clase Render
		Render.batch = new SpriteBatch();

		// Cambia de pantalla
		setScreen(new CargaView());
	}

	/* Esta funcion se ejecuta en paralelo al programa. Su objetivo es dibujar (actualizar) 60 veces por segundo (en este
	 * caso) un sprite en pantalla.
	 * 
	 * En otras palabras funciona como un bucle. */
	@Override
	public void render() {
		super.render();
	}

	// Libera la memoria sin uso
	@Override
	public void dispose() {
		Render.batch.dispose();
	}

}
