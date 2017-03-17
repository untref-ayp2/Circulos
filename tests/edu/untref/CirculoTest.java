package edu.untref;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void unCirculoSabeCalcularSiUnPuntoEstaContenidoEnEl() {
		Circulo circulo = new Circulo(new Punto(1.0, 1.0), 6.0);
		Punto unPunto = new Punto(5.0, 4.0);

		Assert.assertTrue(circulo.contieneA(unPunto));
	}

	@Test
	public void unCirculoSabeCalcularSiUnPuntoNoEstaContenidoEnEl() {
		Circulo circulo = new Circulo(new Punto(1.0, 1.0), 3.0);
		Punto unPunto = new Punto(5.0, 4.0);

		Assert.assertFalse(circulo.contieneA(unPunto));
	}

	@Test
	public void unCirculoSabeCalcularSiIntersectaConOtroCirculo() {
		Circulo unCirculo = new Circulo(new Punto(1.0, 1.0), 3.0);
		Circulo otroCirculo = new Circulo(new Punto(5.0, 4.0), 4.0);

		Assert.assertTrue(unCirculo.intersectaCon(otroCirculo));
	}

	@Test
	public void unCirculoSabeCalcularSiNoIntersectaConOtroCirculo() {
		Circulo unCirculo = new Circulo(new Punto(1.0, 1.0), 1.0);
		Circulo otroCirculo = new Circulo(new Punto(5.0, 4.0), 2.0);

		Assert.assertFalse(unCirculo.intersectaCon(otroCirculo));
	}
	
}
