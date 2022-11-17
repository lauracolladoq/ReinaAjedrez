package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	private Color color;
	private Posicion posicion;

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Reina() {
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	public Reina(Color color) {
		this();
		setColor(color);
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'd');
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'd');
		}

	}

}
