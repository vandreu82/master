package practicas03;
import java.util.Scanner;

/**
 * Ejercicio07.java
 * Escribe un programa que muestre el factorial de un número leído por teclado.
 * Víctor Mannuel Andreu Felipe 
 *
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe el numero del que quieres calcular el factorial");

		int num = teclado.nextInt();
		int total = calculoFactorial(num);

		System.out.println("El factorial de " + num + " es " + total);

		teclado.close();
	}
	
	private static int calculoFactorial(int num) {
		int tota = 1;

		for (int i = 1; i <= num; i++) {
			tota *= i;
		}
		return tota;
	}
}