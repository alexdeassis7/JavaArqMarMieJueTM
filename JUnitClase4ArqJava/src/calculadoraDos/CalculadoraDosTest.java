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

	//codigo que se ejecuta una unica vez al final de la clase
	@AfterClass
	public static void afterClass() {//este metodo debe ser static para que se ejecute correctamente 
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

}
