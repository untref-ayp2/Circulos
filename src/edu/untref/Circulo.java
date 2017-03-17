package edu.untref;

public class Circulo {

	private Punto centro;
	private double radio;

	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public boolean contieneA(Punto punto) {
		return (this.centro.distanciaCon(punto) <= this.radio);
	}

	public boolean intersectaCon(Circulo that) {
		return ((this.radio + that.radio) > this.centro.distanciaCon(that.centro));
	}

}
