import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraParametroTest5 {
	Calculadora c;
	@BeforeEach
	public void before() {
		System.out.println("Before");
		c = new Calculadora();
	}
	
	
	
	
	@ParameterizedTest
	@MethodSource("listaNumeros")
	void testSuma(int a, int b, int esperado) {
		System.out.println(a +"+" + b +" = "+esperado);
		int resultado = c.add(a,b);
		assertEquals(esperado, resultado);
	}
	
	static Stream<Arguments> listaNumeros() {
	    return Stream.of(
	            Arguments.of(1,2,3),
	            Arguments.of(5,4,9)
	        );
	    }





}
