package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private void Consola() {
	}

	public static void mostrarMenu() {
		System.out.println("""
				----------------------------------------------------
				Pulsa 1 para crear la reina por defecto
				Pulsa 2 para crear la reina eligiendo el color
				Pulsa 3 para moverte
				Pulsa 4 para salir
						""");
	}

	public static int elegirOpcionMenu() {
		int opcion;
		do {
			System.out.print("Selecciona una opción del menú");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}

	public static Color elegirColor() {
		Color color = null;
		int numcolor;
		do {
			System.out.print("Selecciona un color, 1 para blanco y 2 para negro");
			numcolor = Entrada.entero();
		} while (numcolor < 1 || numcolor > 2);
		if (numcolor == 1) {
			color = Color.BLANCO;
		} else if (numcolor == 2) {
			color = Color.NEGRO;
		}
		return color;
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
		Direccion direccion = null;
		do {
			System.out.print ("Selecciona una dirección");
			numdireccion = Entrada.entero();
		} while (numdireccion < 1 || numdireccion > 8);
		switch (numdireccion) {
		case 1:
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.NORESTE;
			break;
		case 3:
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.SURESTE;
			break;
		case 5:
			direccion = Direccion.SUR;
			break;
		case 6:
			direccion = Direccion.SUROESTE;
			break;
		case 7:
			direccion = Direccion.OESTE;
			break;
		case 8:
			direccion = Direccion.NOROESTE;
			break;
		}
		return direccion;
	}

	public static int elegirPasos() {
		int numpasos;
		System.out.print("Selecciona el número de pasos que avanzar");
		numpasos = Entrada.entero();
		return numpasos;
	}

	public static void despedirse() {
		System.out.println("Hasta luego <3");
	}
}
