package testjunitsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import calculadora.CalculadoraTest;
import calculadoraDos.CalculadoraDosTest;

//este tippo de clases debe ser creado como una Suite Junit y NO como un "Junit Test"
@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculadoraDosTest.class
})
public class AllTestSuite {
	//esta clase por lo general esta vacia , lo importante es que le indiquemos
	//mediante anotaciones el runner "Suite.class" , y luego debemos decirle con la 
	//anotacion @SuiteClass entre las llaves "{ .. ... }" todas las clases de test que 
	//queremos que se ejecuten y se ejecutaran en el mismo orden en el que fueron 
	//escritas
}
