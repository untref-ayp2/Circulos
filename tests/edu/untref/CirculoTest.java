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

}
