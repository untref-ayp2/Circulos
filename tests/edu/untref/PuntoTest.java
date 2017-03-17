package edu.untref;

import org.junit.Assert;
import org.junit.Test;

public class PuntoTest {

	@Test
	public void unPuntoSabeCalcularLaDistaciaAOtroPunto() {
		Punto unPunto = new Punto(1.0, 1.0);
		Punto otroPunto = new Punto(5.0, 4.0);

		Assert.assertEquals(5.0, unPunto.distanciaCon(otroPunto), 0.001);
	}

}
