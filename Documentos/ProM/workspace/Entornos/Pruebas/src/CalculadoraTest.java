import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//EJEMPLO PRUEBAS EN JUNIT4
public class CalculadoraTest {
static Calculadora c;
@BeforeClass
public static void beforeClass() {
	System.out.println("Beforeclass()");
	c = new Calculadora();
}
@AfterClass
public static void afterClass() {
	System.out.println("Afterclass()");
	
}

	@Before
	public void before() {
		System.out.println("before()");
		c.clear();
	}
	
	@After
	public void after() {
		System.out.println("after()");
	}
	
	@Test
	public void testSuma() {
		System.out.println("suma()");
		int resul = c.add(3,2);
		int esperado = 5;
		assertEquals(esperado, resul);
	}
	
	@Test
	public void testAnsSuma() {
		System.out.println("AnsSuma()");
		c.add(3,2);
		int resul = c.ans();
		int esperado = 5;
		assertEquals(esperado, resul);
	}
	
	@Test
	public void testDiv() {
		int resultado = c.div(5, 2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		c.div(5, 0);

	}
	
	@Test(timeout = 4000)
	public void testOperacionLarga() {
		c.operacionLarga();
	}

}

