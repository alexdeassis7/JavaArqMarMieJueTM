package testparametrizado;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calculadoraDos.CalculadoraDos;

//Test parametrizados

//esta anotacion nos sirve para indicarle a JUnit que corra el test
//con un runner en particular , en este caso el runner es "Parameterized" y es el 
//constructor que se ocupa de realizar las prubeas unitarias parametrizadas , necesitaresmo
//un metodo static, public y retorne un Iterable
@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

	@Parameters
	public static Iterable<Object[]> getData() {
		// el arrays debera tener tantos objetos como parametros posea el constructor en
		// este caso son
		// tres (int a, int b, int expected) ,cuando se ejecute la prueba el junit
		// buscara el metodo que
		// tiene nuestra anotacion @Parameters y es de este metodo donde nos va a
		// extraer todos los
		// datos para ejecutar el test parametrizado

		List<Object[]> obj = new ArrayList<>();

		obj.add(new Object[] { 3, 1, 4 });
		obj.add(new Object[] { 3, 2, 5 });
		obj.add(new Object[] { 3, 3, 6 });
		obj.add(new Object[] { 23, 1, 24 });
		

		// otra opcion para realizar esta List iterable
//		return Arrays.asList(new Object[][] {
//			{3,1,4},{3,2,5},{23,1,124}
//		});
		return obj;
	}

	private int a, b, expected;

	// creamos un constructor para nuestro test
	public CalculadoraParametroTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	// creamos el test
	@Test
	public void testAdd() {
		CalculadoraDos calc = new CalculadoraDos();
		int resultado = calc.add(a, b);
		System.out.println("Ejecutando el test con : " + a + " + " + b + " = " + resultado);
		assertEquals(expected, resultado);
	}

}
