package calculadoraDos;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraDosTest {

	// creamos el atributo como static para poder hacer un correcto uso de el
	// "BeforeClass"
	static CalculadoraDos calc;

	// este metodo se ejecutara una UNICA VEZ al inicio de la ejecucion de la clase
	// sirve por ejemplo para crear objetos muy pesados o asegurarnos que un objeto
	// se crea siempre que se inicializa la clase ....etc
	@BeforeClass
	public static void beforeClass() {// debe ser static SI o SI
		System.out.println(" BeforeClass()");
		calc = new CalculadoraDos();
	}

	// sirve para ejecutar codigo antes de que se ejecute cada una de las pruebas
	// unitarias(metodos anotados con @Test)
	@Before
	public void before() {
		System.out.println("     Before()");
		calc = new CalculadoraDos();// no forma parte de la prueba en si , seria una precondicion para ejecutar el
									// test
	}

	@After // codigo que se ejecutara despues de cada uno de los test unitarios
	public void after() {
		System.out.println("     After()");
		calc.clear();
	}

	// codigo que se ejecuta una unica vez al final de la clase
	@AfterClass
	public static void afterClass() {// este metodo debe ser static para que se ejecute correctamente
		System.out.println(" AfterClass()");
		calc.clear();
	}

	@Test
	public void testSum() {
		System.out.println("        Ejecutando Test: TestSum() ");
		int result = calc.add(3, 2);
		int esperado = 5;
		assertEquals(esperado, result);
	}

	@Test
	public void testAnsSum() {
		System.out.println("        Ejecutando Test: TestAnsSum() ");
		int result = calc.add(5);
		int esperado = 5;
		assertEquals(esperado, result);
	}

	@Test
	public void testDiv() {
		System.out.println("        Ejecutando Test: TestAnsSum() ");
		int result = calc.div(6, 2);
		assertEquals(3, result);
	}

	// esta prueba funcionara por que se espera un error con el expected
	// un expected siempre va a fallar si no se gerena la Exception que se le indica
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		System.out.println("        Ejecutando Test: TestDivPorCero() ");
		// forzamos que el metodo lanze la exception al intentar dividir por cero
		int result = calc.div(5, 0);
	}

	// timeout nos sirve para testear un metodo que tarda mas de lo normal en su
	// ejecucion
	@Test(timeout = 2500)
	public void testAlgoritmoOptimo() {
		System.out.println("        Ejecutando Test: testAlgoritmoOptimo() ");
		calc.operacionOptima();

	}

}
