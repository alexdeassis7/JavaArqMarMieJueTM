package calculadoraDos;

public class CalculadoraDos {

	private int ans;

	public CalculadoraDos() {

	}

	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}

	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}

	// metodo division que lanza una Exception
	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("No Podes dividir por cero en los numeros Reales!");
		}
		ans = a / b;
		return ans;
	}

	public int add(int v) {
		ans += v;
		return ans;
	}

	public int sub(int v) {
		ans -= v;
		return ans;
	}

	public int ans() {
		return ans;
	}

	public void clear() {
		ans = 0;
	}

	// deberia estar optimizado
	public void operacionOptima() {
		try {
			Thread.sleep(2000); //demoramos la ejecucion del Hilo.
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		
		}
	}
}
