package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	Reina reina;

	public static void main(String[] args) {
		Consola.mostrarMenu();
		ejecutarOpcion(Consola.elegirOpcionMenu());
	}

	private static void ejecutarOpcion (int opcion) {
		switch(opcion) {
		case 1:
			crearReinaDefecto();
			mostrarReina();
			break;
		case 2:
			crearReinaColor();
			mostrarReina();
			break;
		case 3: 
			mover();
			mostrarReina();
			break;
		case 4:
			desped
		}
	}
	private static void crearReinaDefecto () {
		
	}
	
	private static void crearReinaColor () {
		
	}
	private static void mover () {
		
	}
	private static void mostrarReina () {
		
	}


}
