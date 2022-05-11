package practicas02;
/**
 * Ejercicio06.java
 * Escribe un programa que muestre las tablas de multiplicar.
 * Para la visualización utiliza un método llamado calcularMostrarTabla().
 * Víctor Manuel Andreu Felipe  
 * 
 */
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = teclado.nextInt();
		calcularMostrarTabla(num);
		teclado.close();
	}

	static void calcularMostrarTabla(int num) {
		System.out.println("\nTabla del " + num + "\n");
		for (int i = 1; i <= 15; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		return;
	}
}
