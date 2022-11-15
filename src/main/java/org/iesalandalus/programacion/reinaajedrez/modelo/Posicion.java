package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;

	private void setFila(int fila) {
		if (fila < 1) {
			throw new IllegalArgumentException("El valor de la posición de la fila es menor que el mínimo permitido.");
		} else if (fila > 8) {
			throw new IllegalArgumentException("El valor de la posición de la fila es mayor que el máximo permitido.");
		}
		this.fila = fila;
	}

	public int getFila() {
		return fila;
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

	public char getColumna() {
		return columna;
	}

	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}

	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("La posición no puede ser nula");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return String.format("fila=valorFila, columna=valorColumna", fila, columna);
	}

}
