package asserts;





import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import calculadora.Calculadora;

public class AssertTest {

	@Test
	public void test() {
//		assertEqual(long , long ); 
//		assertEqual(Object , Object ); //debe estar implementado correctamente el metodo equals en el objeto 
//		assertEqual(double , double , double delta); //el delta es la tolerancia a la falla 
//		assertEqual(String mensaje , double , double ) //en el caso que falle se mostrara el mensaje del parametro 1

		// ej :
		// assertEquals("3 es distindo de 4", 4, 5);
//		assertEqualArray (funciona igual que con los demas numbers)
//		assertFalse() y assertTrue() : sirven para validar que una determinada condicion sea falsa o verdadera 

//		assertNotEquals() : funciona al reves que los assertEquals ,osea que falla cuando sean iguales los pararametros
//		assertNotNull(); : sirve para comprobar que algo no sea null
//		assertNull(); : sirve para comprobar que algo sea null
//		assertSame(expected ,actual) ; //sirve para comprobar que los objetos testeados sean los mismos  
//		por ejemplo:

		Calculadora s1 = new Calculadora();

		//Calculadora s2 = new Calculadora();
		//si reemplazamos por 
		Calculadora s2 = s1;
		

		String st1 = "hola";
		String st2 = "hola";

		//assertEquals(st1, st2); //esto nos retorna true por que los dos strings son iguales 
		
		assertSame(s1, s2);//esto da false por que ambos objetos estan en posiciones de memoria distintas 
		
	}

}
