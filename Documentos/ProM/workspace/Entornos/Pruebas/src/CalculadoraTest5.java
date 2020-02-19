import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static java.time.Duration.ofMinutes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//EJEMPLO DE PRUEBAS EN JUNIT 5
class CalculadoraTest5 {

	static Calculadora c;
	@BeforeAll
	public static void beforeClass() {
		System.out.println("BeforeAll()");
		c = new Calculadora();
	}
	@AfterAll
	public static void afterClass() {
		System.out.println("AfterAll()");
		
	}

		@BeforeEach
		public void before() {
			System.out.println("before()");
			c.clear();
		}
		
		@AfterEach
		public void after() {
			System.out.println("after()");
		}
		
		@Test
		public void testSuma() {
			System.out.println("suma()");
			int resul = c.add(3,2);
			int esperado = 5;
			assertEquals(resul, esperado);
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
		
		@Test
		public void testDivPorCero() {
			assertThrows(ArithmeticException.class, () -> {
				c.div(5, 0);
			  });
			

		}
		@Test
		public void testOperacionLarga() {
			 //The following assertion succeeds.
		    assertTimeout(ofMinutes(2), () -> {
		    	c.operacionLarga();
		    });
			c.operacionLarga();
		}

}
