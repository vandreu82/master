package practicas02;
import java.util.Scanner;

/**
 * Ejercicio04.java
 * A partir de los archivo de Multiplo2.java y Multiplo3.java de los ejercicios anteriores:
 * Crea una sola clase llamada Multiplo4.
 * En main(), escribe la llamada:
 * mostrarMultiplos2(pedirTope());
 * Hay que hacer que todo funcione correctamente.
 * Víctor Manuel Andreu Felipe
 * 
 */

public class Ejercicio04 {
	public static void main(String argumentos[]) {

		mostrarMultiplos2(pedirTope());
	}

	private static void mostrarMultiplos2(int tope) {
		int mult;
		int i;

		mult = 0;
		i = 0;

		System.out.println("\t Múltiplos de 2\n");

		while (mult < tope) {
			mult = i * 2;
			System.out.println("\t  " + '#' + (i + 1) + '\t' + mult);
			++i;
		}
	}

	private static int pedirTope() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe el valor tope hasta el que quieres que se muestren multiplos de 2");
		int valor = teclado.nextInt();
		
		teclado.close();
		return valor;
	}
}