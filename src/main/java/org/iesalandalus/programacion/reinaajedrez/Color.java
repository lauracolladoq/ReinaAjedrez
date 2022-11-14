package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO("Blanco"), NEGRO("Negro");

	String cadenaAMostrar;

	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}

	@Override
	public String toString() {
		return String.format(cadenaAMostrar);
	}
}
