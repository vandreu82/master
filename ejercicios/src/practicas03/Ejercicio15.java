package practicas03;
import java.util.Scanner;

/**
 * Ejercicio15.java
 * Escribe un método llamado fibonacciA() utilizando programación por contrato que reciba un entero y devuelva
 * el valor que le corresponde en la sucesión de Fibonacci.
 * Víctor Manuel Andreu Felipe
 *
 */

public class Ejercicio15 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		String a = fibonacciA(teclado.nextInt());
		
		System.out.print(a);
		teclado.close();
	}
	static String fibonacciA(int num) {
		assert (num>0):"El número es negativo";
		String a="";
		int valor1 = 1,valor2 = 1;
		for (int i = 0; i < num; i++) {
			valor1 += valor2;
			valor2 = valor1 - valor2;
			a = a.concat(Integer.toString(valor2)+" ");
		}
		return a;
	}
}