package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
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

	public static void mostrarMenuDirecciones() {
		System.out.println("""
				Pulsa 1 para desplazarte al norte
				Pulsa 2 para desplazarte al noreste
				Pulsa 3 para desplazarte al este
				Pulsa 4 para desplazarte al sureste
				Pulsa 5 para desplazarte al sur
				Pulsa 6 para desplazarte al suroeste
				Pulsa 7 para desplazarte al oeste
				Pulsa 8 para desplazarte al noroeste
						""");
	}

	public static Direccion elegirDireccion() {
		int numdireccion;
		do {
			System.out.println("Selecciona una dirección");
			numdireccion = Entrada.entero();
		} while (numdireccion < 1 || numdireccion > 8);
		switch (numdireccion) {
		case 1:
			return Direccion.NORTE;
		case 2:
			return Direccion.NORESTE;
		case 3:
			return Direccion.ESTE;
		case 4:
			return Direccion.SURESTE;
		case 5:
			return Direccion.SUR;
		case 6:
			return Direccion.SUROESTE;
		case 7:
			return Direccion.OESTE;
		case 8:
			return Direccion.NOROESTE;
		}
		return null;
	}

	public static int elegirPasos() {
		int numpasos;
		System.out.println("Selecciona el número de pasos que avanzar");
		numpasos = Entrada.entero();
		return numpasos;
	}

	public static void despedirse() {
		System.out.println("Hasta luego <3");
	}
}
