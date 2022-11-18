package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	static Reina reina;

	public static void main(String[] args) {
		Consola.mostrarMenu();
		ejecutarOpcion(Consola.elegirOpcionMenu());
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
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
			Consola.despedirse();
			break;
		}
	}

	private static void crearReinaDefecto() {
		reina = new Reina();
	}

	private static void crearReinaColor() {
		Color color = Consola.elegirColor();
		reina = new Reina(color);
	}

	private static void mover() {
		try {
			Direccion direccion = Consola.elegirDireccion();
			int numpasos = Consola.elegirPasos();
			reina.mover(direccion, numpasos);
		} catch (IllegalArgumentException|OperationNotSupportedException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void mostrarReina() {

	}

}
