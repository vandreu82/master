package practicas03;
import java.util.Scanner;

/**
 * Ejercicio16.java
 * Escribe un método llamado  palabrasCuatroLetras()que recibe una cadena de texto
 * como parámetro y devuelve la lista de palabras con al menos cuatro letras.
 * Víctor Manuel Andreu Felipe
 */

public class Ejercicio16 {
	static Scanner teclado = new Scanner(System.in);
	static String texto = "";

	public static void main(String[] args) {

		pedirCadenaTexto();
		System.out.println("Palabras con 4 letras o mas: ");
		palabrasCuatroLetras(texto);
	}

	static void pedirCadenaTexto() {
		System.out.print("Introduce un texto: ");
		texto = teclado.nextLine();
	}

	static void palabrasCuatroLetras(String texto) {
		String[] palabras = texto.split("[, ?.@\t\n]+");
		for (int j = 0; j < palabras.length; j++) {
			if (palabras[j].length() > 0) {
				if (palabras[j].length() >= 4) {
					System.out.println(palabras[j]);
				}
			}
		}
	}
}
