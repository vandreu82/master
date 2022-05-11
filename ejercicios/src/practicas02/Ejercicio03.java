package practicas02;
import java.util.Scanner;

/**
 * Ejercicio03.java
 * Crea un método dentro de la clase que se llame pedirTope(). Este método está especializado en pedir un 
 * valor por teclado y devolverlo para ser usado en main().
 * Como el tope es ahora variable; habría que modificar la declaración correspondiente para que no sea final.
 * Víctor Manuel Andreu Felipe
 * 
 */
public class Ejercicio03 {

	public static void main(String argumentos[]) {
		int tope = pedirTope();
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