package practicas03;
import java.util.Scanner;
/**
 * Ejercicio02.java
 * Crea un método dentro de la clase que se llame mostrarMultiplos2() 
 * especializado en mostrar los múltiplos de 2 hasta el TOPE.
 * Recibe un valor tope como parámetro de entrada.
 * Víctor Manuel Andreu Felipe 
 *
 */


public class Ejercicio02 {
	public static void main(String argumentos[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe el valor tope hasta el que quieres que se muestren multiplos de 2");
		int tope = teclado.nextInt();

		mostrarMultiplos2(tope); 
		teclado.close();

	}

	public static void mostrarMultiplos2(int tope) {
	
		Scanner teclado = new Scanner(System.in);
		int mult; 
		int i; 

		mult = 0;
		i = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope) 
		{
			mult = i * 2;
			System.out.println("\t  " + '#' + (i + 1) + '\t' + mult);
			++i;
		}
		teclado.close();
	}

}