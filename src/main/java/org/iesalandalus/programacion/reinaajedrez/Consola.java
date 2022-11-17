package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private void Consola() {
	}

	public static void mostrarMenu() {
		System.out.println("""
				Pulsa 1 para crear la reina por defecto
				Pulsa 2 para crear la reina eligiendo el color
				Pulsa 3 para mover
				Pulsa 4 para salir
						""");
	}

	public static int elegirOpcionMenu() {
		int opcion;
		do {
			System.out.println("Selecciona una opción del menú");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}

	public static Color elegirColor() {
		Color color;
		int numcolor;
		do {
			System.out.println("Selecciona un color, 1 para blanco y 2 para negro");
			numcolor = Entrada.entero();
		} while (numcolor < 1 || numcolor > 2);
		if (numcolor == 1) {
			return Color.BLANCO;
		} else if (numcolor == 2) {
			return Color.NEGRO;
		}
		return null;
	}
	
}
