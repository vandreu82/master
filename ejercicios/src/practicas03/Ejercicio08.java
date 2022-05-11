package practicas03;
import java.util.Scanner;

/**
 * Ejercicio08.java
 * Escribe un método llamado fibonacci() que reciba un entero, compruebe que es 
 * válido y devuelva el valor que le corresponde en la sucesión de Fibonacci.
 * Víctor Manuel Andreu Felipe
 * 
 */

public class Ejercicio08 {
	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número positivo: ");
		int num = teclado.nextInt();

		if (num < 0) {
			System.err.println("ERROR: Los numeros negativos no existen en la sucesion de Fibonacci");
			System.err.print("Fin del programa");
			teclado.close();
			return;
		}

		System.out.print("El termino " + num + " en la sucesion de Fibonacci es el " + fibonacci(num));
		teclado.close();
	}

	static int fibonacci(int num) {
		
		for (int i = 1; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return a;
	}
}