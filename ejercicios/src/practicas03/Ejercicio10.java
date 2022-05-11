package practicas03;
import java.util.Scanner;

/**
 * Ejercicio10.java 	
 * Escribe un método que se llame rombo() que reciba un número entero como parámetro y muestre por pantalla  un rombo de asteriscos.
 * Víctor Manuel Andreu Felipe
 *
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número impar: ");
		int num = teclado.nextInt();

		if (num % 2 != 0) {
			rombo(num);
		} else {
			System.err.print("ERROR: El número no es impar.");
		}
		teclado.close();
	}

	static void rombo(int num) {
		for (int i = 0; i < num / 2; i++) {
			System.out.print(" ".repeat(num - i));
			System.out.println("*".repeat(1 + (i * 2)));
		}
		for (int i = (num / 2); i >= 0; i--) {
			System.out.print(" ".repeat(num - i));
			System.out.println("*".repeat(1 + (i * 2)));
		}
	}
}