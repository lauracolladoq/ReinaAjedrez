package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private static final int min_fila = 1;
	private static final int max_fila = 8;
	private static final char min_columna = a;
	private static final char max_columa = h;
	
	
	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		this.columna = columna;
	}

}
