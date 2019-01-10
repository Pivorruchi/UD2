import static org.junit.Assert.*;

import org.junit.Test;

public class testSatelite {

	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	@Test
	public void testConstructor1() {
		meridiano = 10;
		paralelo = 15;
		distancia_tierra = 25;
		Satelite sateliteTest = new Satelite(meridiano, paralelo, distancia_tierra);

		assertEquals(sateliteTest.meridiano, 10, 0);
		assertEquals(sateliteTest.paralelo, 15, 0);
		assertEquals(sateliteTest.distancia_tierra, 25, 0);

	}

	@Test
	public void testConstructor2() {
		
		Satelite sateliteTest = new Satelite();

		assertEquals(sateliteTest.meridiano, 0, 0);
		assertEquals(sateliteTest.paralelo, 0, 0);
		assertEquals(sateliteTest.distancia_tierra, 0, 0);

	}

	@Test
	public void testSetPosicion() {
		
		Satelite sateliteTest = new Satelite();

		sateliteTest.setPosicion(345, 14, 55);
		assertEquals(sateliteTest.meridiano, 345, 0);
		assertEquals(sateliteTest.paralelo, 14, 0);
		assertEquals(sateliteTest.distancia_tierra, 55, 0);

	}

}
