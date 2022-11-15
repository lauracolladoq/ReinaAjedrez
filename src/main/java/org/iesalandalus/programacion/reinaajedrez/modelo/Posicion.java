package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1) {
			throw new IllegalArgumentException("El valor de la posición de la fila es menor que el mínimo permitido.");
		} else if (fila > 8) {
			throw new IllegalArgumentException("El valor de la posición de la fila es mayor que el máximo permitido.");
		}
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (fila < 'a') {
			throw new IllegalArgumentException(
					"El valor de la posición de la columna es menor que el mínimo permitido.");
		} else if (fila > 'h') {
			throw new IllegalArgumentException(
					"El valor de la posición de la columna es mayor que el máximo permitido.");
		}
		this.columna = columna;
	}

}
