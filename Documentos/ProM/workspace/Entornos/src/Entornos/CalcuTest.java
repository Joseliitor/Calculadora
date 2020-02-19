package Entornos;

import static org.junit.Asswe;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalcuTest {

	Calcu c;
	@Before
	public void before() {
		System.out.println("ejecutando el before");
		c = new Calcu();
	}

	@Test
	public void SumaTest() {
		int resultado = c.suma(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void RestaTest() {
		int resultado = c.suma(6, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

}
