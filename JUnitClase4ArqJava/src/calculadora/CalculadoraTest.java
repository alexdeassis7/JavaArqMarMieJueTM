package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		// invocamos al metodo que vamos a testear
		int resultado = Calculadora.suma(2, 3);
		// definimos cual es el resultado esperado del metodo que estamos testeando
		int esperado = 5;
		// Assert son los metodos que nos brinda Junit como resultados esperados
		assertEquals(esperado, resultado);

		// tambien podemos definirlo de la siguiente manera :
//		assertEquals(5, Calculadora.suma(2, 3));

	}

	@Test
	public void testResta() {

		int resultado = Calculadora.resta(3, 2);
		int esperado = 1;

		assertEquals(esperado, resultado);
	}

	@Test // esta anotacion nos marca a nuestro metodo como una prueba
	public void test() {
		// si se llama a la funcion fail(), esto hace que automaticamente
		// nuestro test falle

		// fail("Not yet Implemented");
	}

}
