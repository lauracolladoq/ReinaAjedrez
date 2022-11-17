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

	public void mover(Direccion direccion, int pasos) {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos < 1 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		} else {
			switch (direccion) {
			case NORTE:
				this.posicion = new Posicion(this.posicion.getFila() + pasos, this.posicion.getColumna());
				break;
			case NORESTE:
				this.posicion = new Posicion(this.posicion.getFila() + pasos, (char) (this.posicion.getColumna() + pasos));
				break;
			case ESTE:
				this.posicion = new Posicion(this.posicion.getFila(), (char) (this.posicion.getColumna() + pasos));
				break;
			case SURESTE:
				this.posicion = new Posicion(this.posicion.getFila() - pasos, (char) (this.posicion.getColumna() + pasos));
				break;
			case SUR:
				this.posicion = new Posicion(this.posicion.getFila() - pasos, this.posicion.getColumna());
				break;
			case SUROESTE:
				this.posicion = new Posicion(this.posicion.getFila() - pasos, (char) (this.posicion.getColumna() + pasos));
				break;
			case OESTE:
				this.posicion = new Posicion(this.posicion.getFila(), (char) (this.posicion.getColumna() - pasos));
				break;
			case NOROESTE:
				this.posicion = new Posicion(this.posicion.getFila() + pasos, (char) (this.posicion.getColumna() - pasos));
				break;

			}

		}

	}

	@Override
	public String toString() {
		return String.format("color=%s, posicion=%s", color, posicion);
	}

}
